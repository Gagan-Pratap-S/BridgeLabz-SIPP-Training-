import java.util.LinkedList;

// Abstract Notification class (Abstraction)
abstract class Notification {
    protected String message;
    protected long timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public abstract void display();
}

// inheritance
class LikeNotification extends Notification {
    private String likedBy;

    public LikeNotification(String likedBy) {
        super(likedBy + " liked your post.");
        this.likedBy = likedBy;
    }

    @Override
    public void display() {
        System.out.println("👍 " + message + " [" + timestamp + "]");
    }
}

class CommentNotification extends Notification {
    private String commentBy;
    private String commentText;

    public CommentNotification(String commentBy, String commentText) {
        super(commentBy + " commented: " + commentText);
        this.commentBy = commentBy;
        this.commentText = commentText;
    }

    @Override
    public void display() {
        System.out.println("💬 " + message + " [" + timestamp + "]");
    }
}

// UserFeed class (Encapsulation & API-style Abstraction)
class UserFeed {
    private LinkedList<Notification> notifications;

    public UserFeed() {
        notifications = new LinkedList<>();
    }

    // Add notification at the beginning (fast insert)
    public void addNotification(Notification notification) {
        notifications.addFirst(notification);  // reverse chronological order
    }

    // Display all notifications
    public void displayFeed() {
        System.out.println("\n🔔 Notification Feed:");
        for (Notification n : notifications) {
            n.display();
        }
    }
}

// Driver class
public class NotificationFeed {
    public static void main(String[] args) throws InterruptedException {
        UserFeed userFeed = new UserFeed();

        userFeed.addNotification(new LikeNotification("Alice"));
        Thread.sleep(100);  // simulate time delay
        userFeed.addNotification(new CommentNotification("Bob", "Nice photo!"));
        Thread.sleep(100);
        userFeed.addNotification(new LikeNotification("Charlie"));

        userFeed.displayFeed();
    }
}