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
    public Menu(ArrayList<Items> newItems, Restaurant newRestaurant)
    {
        items = newItems;
    }
    
    public void showMenu(){
        System.out.println();
    }

    /**
     * get Item List -- Menu
     * return ArrayList
     */
    public ArrayList getMenu()
    {
        return items;
    }

}
