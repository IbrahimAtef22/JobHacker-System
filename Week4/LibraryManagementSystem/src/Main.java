package Week4.LibraryManagementSystem.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome To My Library Management System App ***");
        System.out.print("Enter Library Name: ");
        String libName = input.nextLine();
        System.out.print("Enter Library Code: ");
        String libCode = input.nextLine();
        Library library = new Library(libName, libCode);

        while (true){
            System.out.println("\nPlease choose your operation from the list!");
            System.out.println("1- Add book to the library.");
            System.out.println("2- Remove book from the library.");
            System.out.println("3- Check out book.");
            System.out.println("4- Return book.");
            System.out.println("5- Display book details.");
            System.out.println("6- Display available books.");
            System.out.println("7- Display borrowed books.");
            System.out.println("8- Exit.");

            int operation = input.nextInt();
            input.nextLine();

            switch (operation){
                case 1:
                    System.out.print("\nEnter Book Title: ");
                    String title = input.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter Book ID: ");
                    String book_id = input.nextLine();
                    System.out.print("Enter Book Version: ");
                    int version = input.nextInt();
                    input.nextLine();

                    Book book = new Book(title, author, book_id, version);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("\nEnter Book ID to remove: ");
                    book_id = input.nextLine();
                    input.nextLine();

                    for (Book b : library.books){
                        if (b.bookID.equals(book_id)){
                            library.removeBook(b);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nEnter User Name: ");
                    String userName = input.nextLine();
                    System.out.print("Enter User ID: ");
                    String userId = input.nextLine();
                    input.nextLine();

                    User user = new User(userName, userId);

                    System.out.print("\nEnter Book ID to check out: ");
                    book_id = input.nextLine();
                    input.nextLine();

                    User returnedUser = library.checkoutBook(user, book_id);
                    library.users.add(returnedUser);
                    break;

                case 4:
                    User user2 = null;

                    System.out.print("\nEnter user ID: ");
                    userId = input.nextLine();
                    input.nextLine();

                    for (User u : library.users) {
                        if (u.userID.equals(userId)) {
                            user2 = u;
                            break;
                        }
                    }

                    if (user2 == null) {
                        System.out.println("Invalid User ID.");
                        break;
                    }

                    System.out.print("Enter book ID to return: ");
                    book_id = input.nextLine();
                    input.nextLine();

                    library.returnBook(user2, book_id);
                    break;
                case 5:
                    System.out.print("\nEnter book ID to display details: ");
                    book_id = input.nextLine();
                    input.nextLine();

                    for (Book b : library.books) {
                        if (b.bookID.equals(book_id)) {
                            library.displayBookDetails(book_id);
                            break;
                        }
                    }
                    break;
                case 6:
                    library.displayAvailableBooks();
                    break;
                case 7:
                    library.displayBorrowedBooks();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Number!!, please choose a valid one.");
                    break;
            }
        }
    }
}
