/**
 * User interface class, only shows output to user
 *
 * @author Aditya Kumar
 * @version 21/05/2019
 */
public class Boundary
{
    MonashEats monashEats;
    
    /**
     * Constructor for objects of class Interface
     */
    public Boundary()
    {
        //Blank because no fields
    }
    
    /**
     * Customer home menu
     */
    public void customerHome()
    {
        System.out.println("========================================================");
        System.out.println("                    Customer Home");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("1. Order Food");
        System.out.println("2. Manage Cart");
        System.out.println("3. Exit");
    }
    
    /**
     * Shows the overall page
     */
    public void viewRestaurantList()
    {
        System.out.println("========================================================");
        System.out.println("                Viewing Restaurants");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select a restaurant to see their menu:");
        System.out.println();
    }
    
    /**
     * Shows individual restaurant details
     * Usage - ideally use this inside a for loop with a System.out.println(iterator) call
     * Example - for (i = 0; i < 3 ; i++)
     * {
     *     System.out.println(i);
     *     viewRestaurantDetailsForMenu(restaurantList.get(i).getName(), restaurantList.get(i).getAddress(), restaurantList.get(i).getRate())
     * }
     * @param restaurantName The name of the restaurant
     * @param restaurantAddress The restaurant's address
     * @param rating The restaurant's rating
     */
    public void viewRestaurantDetailsForMenu(String restaurantName, String restaurantAddress, int rating)
    {
        System.out.print("\tName: " + restaurantName + " (" + rating + ")");
        System.out.println("\tAddress: "+ restaurantAddress);
    }
    
    /**
     * Just displays "Go back to previous menu". Use inside a loop, with an iterator, after a println() call
     */
    public void goBackToPrevious()
    {
        System.out.print("Go back to previous menu");
    }
    
    /**
     * Shows the menu page header, with restaurant name and address
     * @param restaurantName The name of the restaurant
     * @param restaurantAddress The restaurant's address
     */
    public void showMenu(String restaurantName, String restaurantAddress)
    {
        System.out.println("========================================================");
        System.out.println("\t\t" + restaurantName);
        System.out.println("\t" + restaurantAddress);
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select an item to add to cart:");
        System.out.println();
    }
    
    /**
     * Shows the individual item in the menu
     * @param itemName The name of the food item
     * @param price The item's price
     * @param description The item's description
     */
    public void showItemDetails(String itemName, double price, String description, boolean deal)
    {
        System.out.print("\tFood Name: " + itemName);
        System.out.println("\tPrice: $" + price);
        System.out.println("\tDescription: " + description);
        if (deal)
            System.out.println("\tDeal: The price will be $" + (price * 0.8) + " instead");
    }
    
    /**
     * Shows just "Go to cart". Use inside a loop, after a println() call
     */
    public void goToCart()
    {
        System.out.print("Go to cart");
    }
    
        
}
