package abstraction;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductDemo {
    public static void main(String[] args) {
        ArrayList<BookProduct>books=new ArrayList<>(Arrays.asList(new BookProduct("Agatha Christie","Murder on the Orient Express",300),
                new BookProduct("Agatha christie","Endless Night",270.10f),
                new BookProduct("Harry Potter","JK Rowling",250.84f)));

        ArrayList<ClothingProduct> clothes=new ArrayList<>(Arrays.asList(new ClothingProduct("Shirt",799.23f,"XL"),
                new ClothingProduct("Jeans",1200,"M"),
                new ClothingProduct("T Shirt",400.5f,"XL")));

        ArrayList<ElectronicsProduct> electronics=new ArrayList<>(Arrays.asList(new ElectronicsProduct("Mobile","Samsung",30000),
                new ElectronicsProduct("Charger","Samsung",1700.20f),
                new ElectronicsProduct("Laptop","Honor",48000)));
        float total=0;
        System.out.println("BOOKS:");
        for (Product p:books) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Books price is:"+total);

        System.out.println("--------------------------");
        System.out.println("CLOTHES");
        for (Product p:clothes) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Clothes price is:"+total);

        System.out.println("--------------------------");
        System.out.println("ELECTRONICS");
        for (Product p:electronics) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Electronics price is:"+total);
    }
}
