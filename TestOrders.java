import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

    
        // Menu items:
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("drip coffee", 2.5);
        Item item3 = new Item("latte", 3.5);
        Item item4 = new Item("capuccino", 3.5);
    
        // Orders:
        Order order1 = new Order();
        order1.addItem(item2);
        order1.addItem(item3);
        order1.setReady();
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());

        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item4);
        order2.setReady();
        System.out.println(order2.getStatusMessage());
        System.out.println(order2.getOrderTotal());

        Order order3 = new Order("Moe");
        order3.addItem(item3);
        order3.addItem(item1);
        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());

        Order order4 = new Order("Curly");
        order4.addItem(item4);
        order4.addItem(item2);
        System.out.println(order4.getStatusMessage());
        System.out.println(order4.getOrderTotal());

        Order order5 = new Order("Larry");
        order5.addItem(item4);
        order5.addItem(item1);
        System.out.println(order5.getStatusMessage());
        System.out.println(order5.getOrderTotal());

        // Display:
        System.out.println("\n----- Order Details -----\n");
        System.out.println(order1.getName());
        System.out.println(order1.display());
        System.out.println("\n");
        System.out.println(order2.getName());
        System.out.println(order2.display());
        System.out.println("\n");
        System.out.println(order3.getName());
        System.out.println(order3.display());
        System.out.println("\n");
        System.out.println(order4.getName());
        System.out.println(order4.display());
        System.out.println("\n");
        System.out.println(order5.getName());
        System.out.println(order5.display());

    }
}