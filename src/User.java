import java.util.ArrayList;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String group;
    public User(int id,String name,String group){
        this.id=id;
        this.name=name;
        this.group = group;
    }
    ArrayList<Book> Borrowedbooks = new ArrayList<Book>();
    public void giveBook (Library lib,String title ){
        for(Book book : lib.getBooks()){
            if(Objects.equals(book.getTitle(), title)){
                book.decrement();
                this.Borrowedbooks.add(book);
            }
        }
    }
    public void getBook (Library lib,String title ){
        for(Book book : lib.getBooks()){
            if(Objects.equals(book.getTitle(), title)){
                book.increment();
                this.Borrowedbooks.remove(book);
            }
        }
    }
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
        System.out.println(this.id+" "+this.name+" "+this.group);
        for(Book book: Borrowedbooks){
            System.out.println(book.getTitle());
        }
    }

    public int getId() {
        return id;
    }
}
