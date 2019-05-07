import java.util.ArrayList;

/**
 * Objects of this class contain all orders for a restaurant
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class OrderList
{
    ArrayList<Order> orders;
    
    /**
     * Default constructor
     */
    public OrderList()
    {
        orders = new ArrayList<Order>();
    }
    
    public OrderList(ArrayList<Order> newOrders)
    {
        orders = newOrders;
    }
    
    public void showAllOrders()
    {
        System.out.println("Showing all orders");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("1.\tCustomer - Aditya\n\tOrder Date - 1/5/2019\n\tOrder Status - Delivered\n\tPayment Status - Paid");
        System.out.println("2.\tCustomer - Lyman\n\tOrder Date - 2/5/2019\n\tOrder Status - Delivered\n\tPayment Status - Paid");
        System.out.println("3.\tCustomer - Moon\n\tOrder Date - 3/5/2019\n\tOrder Status - Delivered\n\tPayment Status - Paid");
        System.out.println("4.\tCustomer - Aditya\n\tOrder Date - 5/5/2019\n\tOrder Status - Delivered\n\tPayment Status - Paid");
        System.out.println("5.\tCustomer - Lyman\n\tOrder Date - 7/5/2019\n\tOrder Status - Preparing\n\tPayment Status - Unpaid");
    }
}
