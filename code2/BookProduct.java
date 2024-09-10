package abstraction;

public class BookProduct extends Product{
    String author;
    BookProduct(String name,String author,float price){
        super(name,price);
        this.author=author;
    }
  
    float getPrice() {
        return this.price;
    }

    void getDescription() {
        System.out.println("Book Name is:"+name);
        System.out.println("Author Name is:"+author);
        System.out.println("Price is:"+price);
    }
}
