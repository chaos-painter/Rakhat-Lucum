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
}
