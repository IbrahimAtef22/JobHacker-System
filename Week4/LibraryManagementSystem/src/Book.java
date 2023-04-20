package Week4.LibraryManagementSystem.src;

public class Book {
    public String title;
    public String author;
    public int bookID;
    public int version;
    public boolean isAvailable;

    public Book(String title, String author, int bookID, int version) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        this.version = version;
        this.isAvailable = true;
    }

    public String toString() {
        return "Book Title: "+title + "\nAuthor: " + author+"\nBook ID: "+bookID+"\nVersion: "+version;
    }
}
