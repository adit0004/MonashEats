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
    
    /**
     * get Order List
     * return ArrayList
     */
    public ArrayList getOrderList()
    {
        return orders;
    }
    
    public void addOrder(Order order)
    {
        orders.add(order);
    }
}
