/**
 * Class for individual food items
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class Items
{
    String itemName;
    String description;
    double price;
    boolean onDeal;
    
    /**
     * Default constructor for objects of class Items
     */
    public Items()
    {
        itemName = "New item";
        description = "This item was created but not given any values.";
        price = 0.0;
        onDeal = false;
    }
    
    /**
     * Parameterized constructor for objects of class Items
     */
    public Items(String newName, String newDescription, double newPrice, boolean newOnDeal)
    {
        itemName = newName;
        description = newDescription;
        price = newPrice;
        onDeal = newOnDeal;
    }
    
    /**
     * Getter method for itemName
     */
    public String getItemName()
    {
        return itemName;
    }
    
    /**
     * Getter method for description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Getter method for price
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Getter method for onDeal
     */
    public boolean getOnDeal()
    {
        return onDeal;
    }
    
    /**
     * Setter method for itemName
     */
    public void setItemName(String newName)
    {
        itemName = newName;
    }
    
    /**
     * Setter method for description
     */
    public void setDescription(String newDescription)
    {
        description = newDescription;
    }
    
    /**
     * Setter method for price
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    /**
     * Setter method for onDeal
     */
    public void setOnDeal(boolean newOnDeal)
    {
        onDeal = newOnDeal;
    }
    
}
