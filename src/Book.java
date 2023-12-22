public class Book {
   private String title, isbn, genre, author;
   private int year, quantity;

   public Book (String title, String isbn, String genre, String author, int year, int quantity) {
       this.title = title;
       this.isbn = isbn;
       this.genre = genre;
       this.author = author;
       this.year = year;
       this.quantity = quantity;
   }
    public String getTitle() {
        return this.title;
    }
    public String getIsbn(){
       return this.isbn;
    }
    public int getQuantity() {
        return quantity;
    }

    public void increment(){
       this.quantity++;
    }
    public void decrement(){
        this.quantity--;
    }
}
