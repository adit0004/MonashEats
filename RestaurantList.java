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
    public void addInList(String newName, String newAddress, String phoneNumber,double newRate, int newRateCount)
    {
        Restaurant Restaurant = new Restaurant(newName,newAddress,phoneNumber,newRate,newRateCount);
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
    
    public void addNewRestaurant(String name, String address, String phone, double rate, int rateCount)
    {
        Restaurant restaurant = new Restaurant(name, address, phone, rate, rateCount);
        restaurantList.add(restaurant);
    }
    
    public Restaurant getRestaurant(int index)
    {
        return restaurantList.get(index);
    }
    
    public int getRestaurantCount()
    {
        return restaurantList.size();
    }
    
    public String getRestaurantName(int index)
    {
        return restaurantList.get(index).getRestaurantName();
    }
    
    public String getRestaurantAddress(int index)
    {
        return restaurantList.get(index).getRestaurantAddress();
    }
    
    public double getRestaurantRating(int index)
    {
        return restaurantList.get(index).getRate();
    }
    
    public int getRestaurantRateCount(int index)
    {
        return restaurantList.get(index).getRateCount();
    }
    
}