import java.util.ArrayList;
/**
 * A collection of items served by a restaurant
 *
 * @author Yupu Li
 * @version 7/5/2019
 */
public class Menu
{
    ArrayList<Items> items;

    /**
     * Default constructor
     */
    public Menu()
    {
        items = new ArrayList<Items>();
    }

    /**
     * Parameterized constructor
     */
    public Menu(ArrayList<Items> newItems)
    {
        items = newItems;
    }

    public void displayMenu()
    {
        if(items.size() != 0)
        {
            int i = 0;
            do{
                items.get(i).displayItem();
                i += 1;
            }while(i < items.size());
        }
        else
            System.out.println("No item in the menu");
    }

    /**
     * add an item into menu ArrayList
     */
    public void addInList(String newName, String newDescription, double newPrice, boolean newOnDeal)
    {
        Items item = new Items(newName,newDescription,newPrice,newOnDeal);
        items.add(item);
    }

    /**
     * remove an item in the menu ArrayList
     */
    public void removeList(int index)
    {
        items.remove(index - 1);
    }

    /**
     * get Item List -- Menu
     * return ArrayList
     */
    public ArrayList getMenu()
    {
        return items;
    }
    
    public void addNewItem(String name, String desc, double price, boolean onDeal)
    {
        Items item = new Items(name, desc, price, onDeal);
        items.add(item);
    }
    
    public int getItemsCount()
    {
        return items.size();
    }
    
    public String getItemName(int index)
    {
        return items.get(index).getItemName();
    }
    
    public String getItemDescription(int index)
    {
        return items.get(index).getDescription();
    }
    
    public double getItemPrice(int index)
    {
        return items.get(index).getPrice();
    }
    
    public boolean getDeal(int index)
    {
        return items.get(index).getOnDeal();
    }

    public Items getItem(int index)
    {
        return items.get(index - 1);
    }
}
