package Week4.LibraryManagementSystem.src;

import java.util.ArrayList;

public class Library {
    public String name;
    public String code;
    public ArrayList<Book> books;
    public ArrayList<User> users;

    public Library(String name, String code) {
        this.name = name;
        this.code = code;
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // method to add a book to the library
    public void addBook(Book book){
        books.add(book);
    }

    // method to remove a book from the library
    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book.title + " has been removed from the library.");
        } else {
            System.out.println(book.title + " is not in the library.");
        }
    }

    // method to check out a book in the library
    public User checkoutBook(User user, String book_id) {
        for (Book book : books) {
            if (book.bookID.equals(book_id) && book.isAvailable) {
                user.borrowedBooks.add(book);
                book.isAvailable = false;
                System.out.println(user.userName + " has checked out " + book.title + ".");
                return user;
            }
        }
        System.out.println("Invalid Book ID or Book is not available.");
        return null;
    }

    // A method to return a book.
    public void returnBook(User user, String book_id){
        for (Book book : user.borrowedBooks){
            if (book.bookID.equals(book_id) && !book.isAvailable){
                user.borrowedBooks.remove(book);
                book.isAvailable = true;
                System.out.println(user.userName + " has returned " + book.title + ".");
                return;
            }
        }
        System.out.println("Invalid Book ID or Book is not borrowed by the user.");
    }

    // A method to display the list of available books.
    public void displayAvailableBooks(){
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : books){
            if (book.isAvailable){
                availableBooks.add(book);
            }
        }
        if (availableBooks.size() > 0) {
            System.out.println("Available books:");
            for (Book book : availableBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books are currently available.");
        }
    }

    // A method to display the list of borrowed books
    public void displayBorrowedBooks(){
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isAvailable) {
                borrowedBooks.add(book);
            }
        }
        if (borrowedBooks.size() > 0) {
            System.out.println("Borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books have been borrowed.");
        }
    }

    // A method to display the book details of a specific book.
    public void displayBookDetails(String book_id){
        for (Book book : books){
            if (book.bookID.equals(book_id)){
                System.out.println(book);
                if (book.isAvailable) {
                    System.out.println("Status: Available");
                } else {
                    for (User u : users) {
                        if (u.borrowedBooks.contains(book)) {
                            System.out.println("Status: Borrowed by " + u.userName);
                            break;
                        }
                    }
                }
                return;
            }
        }
        System.out.println("Invalid Book ID");
    }

}
