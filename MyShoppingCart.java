import java.util.ArrayList;
import java.util.List;
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }
}

class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + " (Brand: " + brand + ") - $" + price;
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + " (Size: " + size + ") - $" + price;
    }
}

class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + " (Author: " + author + ") - $" + price;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Product product : products) {
            System.out.println(product.getDescription());
        }
        System.out.println("Total Price: $" + calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

public class MyShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new ElectronicsProduct("Office Laptop", 1200.99, "Dell");
        Product shirt = new ClothingProduct("Leetcode T-Shirt", 29.99, "M");
        Product book = new BookProduct("Java Programming Book", 45.50, "Joe A");

        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(book);

        cart.displayCart();
    }
}
