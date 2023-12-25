import java.util.ArrayList;
public class Library {
    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<User> Users = new ArrayList<User>();

    public void addBook(Book book) {
        this.Books.add(book);
    }
    public void addUser(User user) {
        this.Users.add(user);
    }
    public ArrayList<Book> getBooks() {
        return this.Books;
    }

    public ArrayList<User> getUsers() {
        return this.Users;
    }

    public void printbooks() {
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        for (Book book : this.Books) {
            System.out.println(ANSI_BLUE + "\"" + book.getTitle() + "\" "+ ANSI_RESET + " : "+ book.getQuantity());
        }
    }

    public void printusers() {
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        for (User user : this.Users) {
            user.getInfo();
        }
    }



}
