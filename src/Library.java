import java.util.ArrayList;
import java.util.Objects;

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


    public void giveBook (String title, int id){
        boolean e = true;
        for(Book book : this.getBooks()){
            if(Objects.equals(book.getTitle(), title) & book.getQuantity()>0){
                for(User u:this.Users){
                    if(Objects.equals(u.getId(),id) && book.getClearance()<=u.getClearance()){
                        u.addBorrowedbook(book);
                        book.decrement();
                        e = false;
                    }
                }
            }
        }
        if(e){
            System.out.println("Nothing happend");
        }

    }
    public void getBook (String title, int id){
        boolean e =true;
        for(Book book : this.getBooks()){
            if(Objects.equals(book.getTitle(), title)){
                for(User user : this.getUsers()) {
                    if(Objects.equals(user.getId(), id)) {
                        if (user.checkBook(title)) {
                            book.increment();
                            user.removeBorrowedbook(book);
                            e = false;
                        }
                    }
                }
            }
        }
        if(e){
            System.out.println("Nothing happend. You are dude, man");
        }

    }

    public void printbooks() {
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        for (Book book : this.Books) {
            System.out.println(ANSI_BLUE + "\"" + book.getTitle() + "\" "+ ANSI_RESET + " : "+ book.getQuantity());
        }
    }

    public void printusers() {
        for (User user : this.Users) {
            user.getInfo();
        }


    }

}
