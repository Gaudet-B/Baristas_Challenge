import java.util.ArrayList;

public class CoffeeKiosk {

    // Member Variables:
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor:
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // Methods:
    public void addMenuItem(String name, double price) {
        int index = this.menu.size();
        Item menuItem = new Item(name, price, index);
        this.menu.add(menuItem);
    }

    public String displayMenu() {
        String menuDisplay = "";
        for (Item item : this.menu) {
            menuDisplay += String.format("%d %s -- $.2f\n", item.getIndex(), item.getName(), item.getPrice());
            // System.out.printf("%d %s -- $.2f\n");
        }
        return menuDisplay;
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        System.out.println(displayMenu());
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            try {
                newOrder.setItem(this.menu.get(Integer.parseInt(itemNumber)));
                System.out.println("Got it. Anything else?");
                itemNumber = System.console().readLine();
            } catch(Exception e) {
                System.out.println(e);
                System.out.println("Error. Please try again.");
                itemNumber = System.console().readLine();
            }
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        System.out.printf("Thank you, %s. Here are your order details:\n", name);
        System.out.println(newOrder.display());
    }

}