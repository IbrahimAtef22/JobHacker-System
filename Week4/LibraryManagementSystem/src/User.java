package Week4.LibraryManagementSystem.src;

import java.util.ArrayList;

public class User {
    public String userName;
    public String userID;
    public ArrayList<Book> borrowedBooks;

    public User(String name, String user_id) {
        this.userName = name;
        this.userID = user_id;
        this.borrowedBooks = new ArrayList<>();
    }

}
