/**
 * Class for individual food items
 *
 * @author Yupu Li
 * @version 7/5/2019
 */
public class Items
{
    public String itemName;
    public String description;
    public double price;
    public boolean onDeal;
    
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
        this.itemName = newName;
        this.description = newDescription;
        this.price = newPrice;
        this.onDeal = newOnDeal;
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

    /**
     * display method for Item
     * show item's 4 attributes
     * name,description,price,onDeal
     */
    public void displayItem() 
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("On Deal: " + onDeal);
        System.out.println();
    }
    
}

