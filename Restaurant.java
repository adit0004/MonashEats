
/**
 * This class stores details of a restaurant
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class Restaurant
{
    String restaurantName;
    String restaurantAddress;
    String restaurantPhoneNumber;
    double rate;
    int ratingCount;
    Menu menu;
    OrderList orders;
    
    /**
     * Default constructor for restaurant
     */
    public Restaurant()
    {
        restaurantName = "New Restaurant";
        restaurantAddress = "Restaurant Address";
        restaurantPhoneNumber = "";
        rate = 0.0;
        ratingCount = 0;
        orders = new OrderList();
        menu = new Menu();
    }
    
    /**
     * Parameterized constructor for restaurant
     */
    public Restaurant(String newRestaurantName, String newRestaurantAddress, String newRestaurantPhoneNumber, double newRate, int newRatingCount, OrderList newOrders, Menu newMenu)
    {
        restaurantName = newRestaurantName;
        restaurantAddress = newRestaurantAddress;
        restaurantPhoneNumber = newRestaurantPhoneNumber;
        rate = newRate;
        ratingCount = newRatingCount;
        orders = newOrders;
        menu = newMenu;
    }
}
