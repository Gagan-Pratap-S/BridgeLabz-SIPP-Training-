package Day5_String;
public class NullPointerExample {
    
public static void generateException() {
    String text = null;
    int length = text.length(); 
    System.out.println("Length: " + length);
}

public static void handleNullPointerException() {
    String text = null;
    try {
        int length = text.length();
        System.out.println("Length: " + length);
    } catch (NullPointerException e) {
        System.out.println("NullPointerException caught while accessing string method.");
    }
}

public static void main(String[] args) {
    handleNullPointerException();
}
}