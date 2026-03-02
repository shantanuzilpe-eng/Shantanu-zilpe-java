// Interface 1
interface Payment {
    void pay(double amount);
}

// Interface 2
interface Refundable {
    void refund(double amount);
}

// Base Class (Encapsulation)
class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}

// Implementing Multiple Interfaces
class OnlineOrder extends Product implements Payment
