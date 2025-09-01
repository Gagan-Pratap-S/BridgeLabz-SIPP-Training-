package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;
public class BookConstructor {
    String title;
    String author;
    double price;

    public BookConstructor() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public BookConstructor(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        BookConstructor book1 = new BookConstructor();
        BookConstructor book2 = new BookConstructor("Java", "James", 599.99);
        book1.display();
        book2.display();
    }
}
