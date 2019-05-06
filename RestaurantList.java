import java.util.ArrayList;

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
}