package abstraction;

public class ClothingProduct extends Product{
    String size;
    ClothingProduct(String name,float price,String size){
        super(name,price);
        this.size=size;
    }
    
    float getPrice() {
        return this.price;
    }

    void getDescription() {
        System.out.println("Name is:"+name);
        System.out.println("Cloth Size is:"+size);
        System.out.println("Price is:"+price);
    }
}
