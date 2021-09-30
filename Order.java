import java.util.ArrayList;

public class Order {

    // Member Variables:
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // Constructor:
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    // Overloaded Constructor:
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // Methods:

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public String display() {
        String returnStr = "Customer Name: ";
        returnStr += this.name;
        double sum = 0;
        for (Item item : this.items) {
            returnStr += String.format("\n%s - $%.2f", item.getName(), item.getPrice());
            sum += item.getPrice();
        }
        returnStr += String.format("\nTotal: $%.2f", sum);
        return returnStr;
    }

    // Getters and Setters:
    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // ready
    public boolean getReady() {
        return ready;
    }
    public void setReady() {
        this.ready = !ready;
    }
    // items
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems (Item item) {
        this.items.add(item);
    }

}