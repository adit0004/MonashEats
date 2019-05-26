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
    public void customerHomePage()
    {
        System.out.println("========================================================");
        System.out.println("                    Customer Home");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("1. Order Food");
        System.out.println("2. Edit Customer information");
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
        System.out.println("Please enter the option (1 - 2): ");
        System.out.println();
        System.out.println("1. Select a restaurant for ordering food");
        System.out.println("2. Go back to Customer Home");
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
        System.out.println();// there should display the menu
        System.out.println();
        System.out.println("Please enter the option (1 - 3): ");
        System.out.println();
        System.out.println("1. Add food into the shopping cart");
        System.out.println("2. Go to the shopping cart");
        System.out.println("3. Go back to restaurant list");
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
    public void shoppingCartPage()
    {
        System.out.println("========================================================");
        System.out.println("                       Shopping Cart");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please enter the option (1 - 3): ");
        System.out.println();
        System.out.println("1. Display cart details");
        System.out.println("2. Go to the shopping cart");
        System.out.println("3. ");
        System.out.println("4. Check out");
        System.out.println();
    }
    
    /**
     * Shows check Out Page information
     */
    public void checkOutPage()
    {
        System.out.println("========================================================");
        System.out.println("                       Check Out");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please enter the option (1 - 4): ");
        System.out.println();
        System.out.println("1. Display cart details");
        System.out.println("2. Select payment method");
        System.out.println("3. Apply conpon");
        //System.out.println("4. Check out");//customer has been in the prograss of checking out in the page
        System.out.println("4. go back to previous page");
        System.out.println();
        
    }

    /**
     * Shows check Out Page information
     */
    public void paymentPage()
    {
        System.out.println("Please select a payment method");
        System.out.println("1. Pay by Card");
        System.out.println("2. Pay by Cash");
        System.out.println();
    }
    
    /**
     * Shows check Out Page information
     */
    public void couponPage()
    {
        System.out.println("========================================================");
        System.out.println("                       Apply coupon");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please enter the option (1 - 2): ");
        System.out.println();
        System.out.println("1. Input the coupon code");
        System.out.println("2. Go back");
    }
    
    /**
     * Shows check Out Page information
     */
    public void afterPaymentPage()
    {
        System.out.println("Please enter the option (1 - 4): ");
        System.out.println();
        System.out.println("1. View the ordered food detail");
        System.out.println("2. Rate the restaurant");
        System.out.println("3. Print the recipt");
        System.out.println("4. Go back to"); //go back to previous page
        System.out.println();
        System.out.println("Please enter the option: ");
    }
    
    /**
     * Shows check Out Page information
     */
    public void ratingPage()
    {
        System.out.print("Please rate the restaurant");
        System.out.print("Please input the rating 1 to 5, 1 is the lowest");
        
    }
    
    /**
     * Shows check Out Page information
     */
    public void showReciptPage(String restaurantName,String restaurantAddress,String customerFirstName, String customerLastName, 
                               String customerAddress, String customerPhoneNumber, String date)
    {
        System.out.println("========================================================");
        System.out.println("                         Recipt");
        System.out.println("========================================================");
        System.out.println(restaurantName);
        System.out.println(restaurantAddress);
        System.out.println("========================================================");
        System.out.println("Customer: " + customerFirstName + " " + customerLastName);
        System.out.println("Customer Address: " +customerAddress);
        System.out.println("Customer Phone Number: " + customerPhoneNumber);
        System.out.println("Order date: " + date);
        System.out.println("========================================================");
        // Then the method displayShoppingCart()
    }
}
