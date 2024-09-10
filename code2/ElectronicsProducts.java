package abstraction;

public class ElectronicsProduct extends Product{
    String brand;
    ElectronicsProduct(String name,String brand,float price){
        super(name,price);
        this.brand=brand;
    }
    
    float getPrice() {
        return this.price;
    }

    void getDescription() {
        System.out.println("Name is:"+name);
        System.out.println("Brand name is:"+brand);
        System.out.println("Price is:"+price);
    }
}
