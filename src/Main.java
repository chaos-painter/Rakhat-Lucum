import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Library lib = new Library();

        User p1=new User(2310,"Rakhat", "IT-2307");
        p1.getInfo();
        while (true){
            System.out.println("1) To add a new book;");
            System.out.println("2) To show all available books;");
            System.out.println("3) To add a new user;");
            System.out.println("4) To give a certain book to a certain user;");
            System.out.println("5) To return a book back to the library from user.");
            int choice = in.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:
                    // Implement logic to display all books
                    break;
                case 3:
                    // Implement logic to add new user
                    break;
                case 4:
                    // Implement logic to issue a book to a user
                    break;
                case 5:
                    // Implement logic to return a book
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
