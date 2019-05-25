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
    
    public void displayShoppingCart()
    {
        System.out.println("========================================================");
        System.out.println("                       Shoping Cart");
        System.out.println("========================================================");
        System.out.println("Item Name ---------------------------------------- Price");
        totalPrice = 0;
        if(items.size() != 0)
        {
            int i = 0;
            do{
                String itemName = items.get(i).getItemName();
                double price = items.get(i).getPrice();
                totalPrice += price;

                System.out.println((i+1) + ". " + itemName + "---------------------------------" + "$ " + price);
                i += 1;
            }while(i < items.size());
        }
        else
            System.out.println("No item in the shopping cart");
        
        System.out.println();
        System.out.println("Delivery ----------------------------------------" + "$ 5.00");
        System.out.println("Total Price -------------------------------- " + "$ " + totalPrice);
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
}
