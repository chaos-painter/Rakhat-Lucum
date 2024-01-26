public class Book {
   private String title, isbn, genre, author;
   private int year, quantity,clearance;

   public Book (String title, String isbn, String genre, String author, int year, int quantity, int clearance) {
       this.title = title;
       this.isbn = isbn;
       this.genre = genre;
       this.author = author;
       this.year = year;
       this.quantity = quantity;
       this.clearance = clearance;
   }
   public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getClearance(){
       return clearance;
    }

    public void increment(){
       this.quantity++;
    }
    public void decrement(){
        this.quantity--;
    }

    public void one() { this.quantity = 2;}
}
