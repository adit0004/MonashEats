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
    
    public void displayRestaurantList()
    {
        if(restaurantList.size() != 0)
        {
            int i = 0;
            do{
                restaurantList.get(i).displayRestaurant();
                i += 1;
            }while(i < restaurantList.size());
        }
        else
            System.out.println("No Restaurant in the menu");
    }

    /**
     * add an Restaurant into menu ArrayList
     */
    public void addInList(String newName, String newAddress, String phoneNumber,OrderList newOrders, Menu newMenu)
    {
        Restaurant Restaurant = new Restaurant(newName,newAddress,phoneNumber,newOrders, newMenu);
        restaurantList.add(Restaurant);
    }

    /**
     * remove an Restaurant in the menu ArrayList
     */
    public void removeList(int index)
    {
        restaurantList.remove(index);
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