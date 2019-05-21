import java.util.ArrayList;
/**
 * A collection of items served by a restaurant
 *
 * @author Yupu Li
 * @version 7/5/2019
 */
public class Menu
{
    Restaurant restaurant;
    ArrayList<Items> items;
    
    /**
     * Default constructor
     */
    public Menu()
    {
        restaurant = new Restaurant();
        items = new ArrayList<Items>();
    }
    
    /**
     * Parameterized constructor
     */
    public Menu(ArrayList<Items> newItems, Restaurant newRestaurant)
    {
        items = newItems;
        restaurant = newRestaurant;
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
   
    /**
     * get Restaurant
     * return ArrayList
     */
    public Restaurant getRestaurant()
    {
        return restaurant;
    }
    
    /**
     * set Restaurant
     * return ArrayList
     */
    public void setRestaurant(Restaurant newRestaurant)
    {
        restaurant = newRestaurant;
    }
}
