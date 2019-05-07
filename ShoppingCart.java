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
            System.out.println(item.getItemName() + " added to cart");
            return items.size();
        }
        return -1;
    }
    
    public void removeItems(int itemIndex)
    {
        //itemIndex starts at 1, items start at 0
        itemIndex = itemIndex - 1;
        
        //Check for validity
        if (itemIndex <= 5)
        {
            items.remove(itemIndex);
            totalPrice = calculatePriceForCart();
        }
    }
    
    public void cancel()
    {
        for (int i = 0 ; i < items.size() ; i++)
        {
            items.remove(i);
        }
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
        return totalPrice;
    }
    
    public void setItemList(ArrayList<Items> newItems)
    {
        items = newItems;
    }
    
    public void setTotalPrice(double newTotalPrice)
    {
        totalPrice = newTotalPrice;
    }
    
    public void showCartDetails()
    {
        System.out.println("Items in cart:");
        System.out.println();
        for (int i = 0 ; i < items.size() ; i++)
        {
            System.out.println((i+1) + ". " + items.get(i).getItemName() + " - $" + items.get(i).getPrice());
        }
        double total = totalPrice + 5;
        System.out.println("Delivery Charges: $5");
        System.out.println("Order Total: $" + total);
        System.out.println("Coupons: $0");
        System.out.println("Balance: $" + total);
        System.out.println();
        System.out.println("Please select your payment option:");
        System.out.println();
        System.out.println("1. Cash");
        System.out.println("2. Coupons");
        
    }
    
}
