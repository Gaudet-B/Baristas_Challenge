public class Item {

    // Member Variables:
    private String name;
    private double price;

    // Constructor:
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters:
    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}