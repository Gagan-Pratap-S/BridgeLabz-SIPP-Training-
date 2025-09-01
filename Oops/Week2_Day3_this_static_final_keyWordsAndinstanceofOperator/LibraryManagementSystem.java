package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;



public class LibraryManagementSystem {
    static String libraryName = "City Library";
    final String isbn;
    String title, author;

    public LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBook() {
        if (this instanceof LibraryManagementSystem) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem b1 = new LibraryManagementSystem("Java Basics", "Nisha", "ISBN1234");
        b1.displayBook();
        displayLibraryName();
    }
}
