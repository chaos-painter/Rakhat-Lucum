import java.util.ArrayList;
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
    public void giveBook (String title){

        this.Borrowedbooks.add();
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
    }


}
