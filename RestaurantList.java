import java.util.ArrayList;
/**
 * Restaurant list management
 *
 * @author Yupu Li
 * @version 7/5/2019
 */

/**
 * This class contains a list of restaurants
 */
public class RestaurantList
{
    ArrayList<Restaurant> restaurantList;
    
    /**
     * Default constructor for RestaurantList
     */
    public RestaurantList()
    {
        restaurantList = new ArrayList<Restaurant>();
    }
    
    /**
     * Parameterized constructor
     */
    public RestaurantList(ArrayList<Restaurant> newRestaurantList)
    {
        restaurantList = newRestaurantList;
    }
    
    /**
     * get Restaurant List
     * return ArrayList
     */
    public ArrayList getRestaurantList()
    {
        return restaurantList;
    }
    
}