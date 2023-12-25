import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Library lib = new Library();

        User p1=new User(2310,"Rakhat", "IT-2307");
        p1.getInfo();

        {
            lib.addBook(new Book("To Kill a Mockingbird", "1234567890", "Classic", "Harper Lee", 1960, 5));
            lib.addBook(new Book("1984", "2345678901", "Dystopian", "George Orwell", 1949, 4));
            lib.addBook(new Book("The Great Gatsby", "3456789012", "Classic", "F. Scott Fitzgerald", 1925, 6));
            lib.addBook(new Book("One Hundred Years of Solitude", "4567890123", "Magical Realism", "Gabriel Garcia Marquez", 1967, 7));
            lib.addBook(new Book("A Brief History of Time", "5678901234", "Science", "Stephen Hawking", 1988, 5));
            lib.addBook(new Book("The Catcher in the Rye", "6789012345", "Classic", "J.D. Salinger", 1951, 4));
            lib.addBook(new Book("The Hobbit", "7890123456", "Fantasy", "J.R.R. Tolkien", 1937, 8));
            lib.addBook(new Book("Pride and Prejudice", "8901234567", "Classic Romance", "Jane Austen", 1813, 3));
            lib.addBook(new Book("Harry Potter and the Sorcerer's Stone", "9012345678", "Fantasy", "J.K. Rowling", 1997, 10));

        }

        {lib.addUser(new User(1, "John Doe", "Group A"));
        lib.addUser(new User(2, "Jane Smith", "Group B"));
        lib.addUser(new User(3, "Alice Johnson", "Group C"));
        lib.addUser(new User(4, "Bob Brown", "Group A"));}
        while (true){
            {System.out.println("1) To add a new book;");
            System.out.println("2) To show all available books;");
            System.out.println("3) To add a new user;");
            System.out.println("4) To give a certain book to a certain user;");
            System.out.println("5) To return a book back to the library from user.");
            System.out.println("6) To show all available users");}
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                {System.out.println("Title");
                    String title = in.nextLine();

                    System.out.println("Isbn");
                    String isbn = in.nextLine();

                    System.out.println("Genre");
                    String genre = in.nextLine();

                    System.out.println("Author");
                    String author = in.nextLine();

                    System.out.println("Year");
                    int year = in.nextInt();
                    in.nextLine();

                    System.out.println("Quantity");
                    int quantity = in.nextInt();
                    in.nextLine();
                    lib.addBook(new Book(title,isbn,genre,author,year,quantity));}
                    break;
                case 2:
                    lib.printbooks();
                    break;
                case 3:
                {System.out.println("ID:");
                    int id = in.nextInt();
                    in.nextLine();
                    boolean idExists;
                    do {
                        idExists = false;
                        for(User user: lib.getUsers()){
                            if(id == user.getId()){
                                System.out.println("insert another ID");
                                id = in.nextInt();
                                idExists = true;
                                in.nextLine();
                                break;
                            }
                        }
                    } while (idExists);
                    System.out.println("Name:");
                    String name = in.nextLine();

                    System.out.println("Group:");
                    String group = in.nextLine();

                    lib.addUser(new User(id, name, group));}
                    break;
                case 4:

                    System.out.println("title");
                    String title1=in.nextLine();
                    System.out.println("ID");
                    int id1=in.nextInt();
                    for(User user: lib.getUsers()){
                        if(id1==user.getId()){
                            user.giveBook(lib,title1);
                            user.getInfo();
                        }
                    }
                    break;
                case 5:

                    System.out.println("title");
                    String title = in.nextLine();
                    System.out.println("ID");
                    int id=in.nextInt();
                    for(User user: lib.getUsers()){
                        if(id==user.getId()){
                            user.getBook(lib,title);
                            user.getInfo();
                        }
                    }
                    break;
                case 6:
                    lib.printusers();
                    break;

                default:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
