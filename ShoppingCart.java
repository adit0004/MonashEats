import java.util.ArrayList;

/**
 * The shopping cart for a customer
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class ShoppingCart
{
    ArrayList<Items> items;
    double totalPrice;

    /**
     * Default onstructor for objects of class ShoppingCart
     */
    public ShoppingCart()
    {
        totalPrice = 0.0;
        items = new ArrayList<Items>();
    }
    
    /**
     * Parameterized constructor for objects of class ShoppingCart
     */
    public ShoppingCart(ArrayList<Items> oldItems, double newTotalPrice){
        items = oldItems;
        totalPrice = newTotalPrice;
    }
    
    public int addItems(Items item)
    {
        if (items.size() < 5)
        {
            items.add(item);
            totalPrice = calculatePriceForCart();
            return items.size();
        }
        else
        {
            System.out.println("Order up to 5 items");
        }
        
        return -1;
    }
    
    public double calculatePriceForCart()
    {
        double total = 0.0;
        
        for (int i = 0 ; i < items.size() ; i++)
        {
            total += items.get(i).getPrice();
        }
        
        return total;
    }
    
    public ArrayList<Items> getItemList()
    {
        return items;
    }
    
    public double getTotalPrice()
    {
        totalPrice = calculatePriceForCart();
        return totalPrice + 5; //5 for deliver
    }
    
    public void setItemList(ArrayList<Items> newItems)
    {
        items = newItems;
    }
    
    public void setTotalPrice(double newTotalPrice)
    {
        totalPrice = newTotalPrice;
    }
    
    public int getItemsCount()
    {
        return items.size();
    }
    
    public String getItemName(int index)
    {
        return items.get(index).getItemName();
    }
    
    public double getItemPrice(int index)
    {
        return items.get(index).getPrice();
    }
    
    
}
