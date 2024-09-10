//2. Create an abstract class named Product with methods like getPrice() and getDescription().
    // Extend the abstract class in classes representing different types of products such as
    // ElectronicsProduct , ClothingProduct , and BookProduct . Display the details of products and
    // calculate the total price in a shopping cart.
package abstraction;
public abstract class Product {
    String name;
    float price;
    Product(String name,float price){
        this.name=name;
        this.price=price;
    }
    abstract float getPrice();
    abstract void getDescription();
}
