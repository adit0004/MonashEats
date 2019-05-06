import java.util.ArrayList;
/**
 * A collection of items served by a restaurant
 *
 * @author Aditya Kumar
 * @version 5/5/2019
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
}
