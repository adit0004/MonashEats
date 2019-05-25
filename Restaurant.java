
/**
 * This class stores details of a restaurant
 *
 * @author Yupu Li
 * @version 7/5/2019
 */
public class Restaurant
{
    public String restaurantName;
    public String restaurantAddress;
    public String restaurantPhoneNumber;
    public double rate;
    public Menu menu;
    public OrderList orders;

    /**
     * Default constructor for restaurant
     */
    public Restaurant()
    {
        restaurantName = "New Restaurant";
        restaurantAddress = "Restaurant Address";
        restaurantPhoneNumber = "";
        rate = 0.0;
        orders = new OrderList();
        menu = new Menu();
    }

    /**
     * Parameterized constructor for restaurant
     */
    public Restaurant(String newRestaurantName, String newRestaurantAddress, String newRestaurantPhoneNumber, OrderList newOrders, Menu newMenu)
    {
        this.restaurantName = newRestaurantName;
        this.restaurantAddress = newRestaurantAddress;
        this.restaurantPhoneNumber = newRestaurantPhoneNumber;
        this.rate = 0.0;
        this.orders = newOrders;
        this.menu = newMenu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhoneNumber() {
        return restaurantPhoneNumber;
    }

    public void setRestaurantPhoneNumber(String restaurantPhoneNumber) {
        this.restaurantPhoneNumber = restaurantPhoneNumber;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public OrderList getOrders() {
        return orders;
    }

    public void setOrders(OrderList orders) {
        this.orders = orders;
    }

    /**
     * display method for restaurant
     * show restaurant's 4 attributes to Customer
     * Name,Address,Phone Number,Rate
     */
    public void displayRestaurant() 
    {
        System.out.println("Item Name: " + restaurantName);
        System.out.println("Restaurant Address: " + restaurantAddress);
        System.out.println("Restaurant Phone Number: " + restaurantPhoneNumber);
        System.out.println("Rate: " + rate);
        System.out.println();
    }

}
