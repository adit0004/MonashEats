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
    public addRestaurant(Restaurant restaurant){
        boolean existed=false;
        for(int i :  restaurantList){
            if(restaurant == restaurantList.get(i)){
               existed=true;
            }
        }
        if(existed){
            System.out.println("This restaurant is existed! Please try again!");
        }else{
            restaurantList.add(restaurant);
        }
    }
    public removeRestaurant(Restaurant restaurant){
        boolean existed=false;
        for(int i :  restaurantList){
            if(restaurant == restaurantList.get(i)){
               existed=true;
            }
        }
        if(existed){
            restaurantList.remove(i);
            System.out.println("This restaurant has been removed successfully!");
        }else{
            System.out.println("This restaurant does not exist! Please try again!");
        }       
    }
}