
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
    public int ratingCount;
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
        ratingCount = 0;
        orders = new OrderList();
        menu = new Menu();
    }
    
    /**
     * Parameterized constructor for restaurant
     */
    public Restaurant(String newRestaurantName, String newRestaurantAddress, String newRestaurantPhoneNumber, double newRate, int newRatingCount, OrderList newOrders, Menu newMenu)
    {
        this.restaurantName = newRestaurantName;
        this.restaurantAddress = newRestaurantAddress;
        this.restaurantPhoneNumber = newRestaurantPhoneNumber;
        this.rate = newRate;
        this.ratingCount = newRatingCount;
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

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
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

    @Override
    public String toString() {
        return "Restaurant{" + "restaurantName=" + restaurantName + ", restaurantAddress=" + restaurantAddress + ", restaurantPhoneNumber=" + restaurantPhoneNumber + ", rate=" + rate + ", ratingCount=" + ratingCount + ", menu=" + menu + ", orders=" + orders + '}';
    }
    
}
