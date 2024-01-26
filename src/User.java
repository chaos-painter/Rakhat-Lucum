import java.util.ArrayList;
import java.util.Objects;

public class User {
    int id;
    String name;
    int clearance = 0;
    String group;
    public User(int id,String name,String group){
        this.id=id;
        this.name=name;
        this.group = group;
    }
    ArrayList<Book> Borrowedbooks = new ArrayList<Book>();
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public void getInfo(){
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(this.id+" "+this.name+" "+this.group);
        for(Book book: this.Borrowedbooks){
            System.out.println(ANSI_BLUE + "\"" + book.getTitle() + "\" "+ ANSI_RESET + " : "+ book.getQuantity());
        }
    }
    public void addBorrowedbook( Book book){
        boolean e=false;
        for(Book b : this.Borrowedbooks){
            if(b.getTitle()==book.getTitle()) {
                b.increment();
                e=true;
            }
        }
        if(!e){
            Book b = new Book(book.getTitle(), book.getIsbn(), book.getAuthor(), book.getGenre(), book.getYear(), 1,book.getClearance());
            this.Borrowedbooks.add(b);
        }
    }
    public void removeBorrowedbook( Book book){
        boolean e=false;
        for(Book b :this.Borrowedbooks){
            if(Objects.equals(b.getTitle(), book.getTitle())) {
                if(b.getQuantity()==1){
                    System.out.println("HALLO");
                    this.Borrowedbooks.remove(b);
                    e=true;
                    return;
                }
                if(b.getQuantity()>1){
                    e=true;
                    b.decrement();
                    return;
                }
            }
        }
        if(!e){
            System.out.println("there is not this book");
        }
    }

    public boolean checkBook(String title) {
        for (Book b : Borrowedbooks){
            if (Objects.equals(title, b.getTitle())) {return true;}
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public int getClearance() {return clearance;}
}
class Staff extends User{
    public Staff(int id, String name, String group) {
        super(id, name, group);
    }

    private int clearance = 2;
    @Override
    public int getClearance() {
        return clearance;
    }

    @Override
    public void getInfo() {
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(this.id+" "+this.name+" "+this.group);
        System.out.println("rank : Staff");
        for(Book book: this.Borrowedbooks){
            System.out.println(ANSI_BLUE + "\"" + book.getTitle() + "\" "+ ANSI_RESET + " : "+ book.getQuantity());
        }
    }
}


class Student extends User{
    public Student(int id, String name, String group){
        super(id,name,group);
    }
    @Override
    public void getInfo() {
        final String ANSI_BLUE = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(this.id+" "+this.name+" "+this.group);
        System.out.println("rank : Student");
        for(Book book: this.Borrowedbooks){
            System.out.println(ANSI_BLUE + "\"" + book.getTitle() + "\" "+ ANSI_RESET + " : "+ book.getQuantity());
        }
    }
    private int clearance = 1;

    @Override
    public int getClearance() {
        return clearance;
    }
}