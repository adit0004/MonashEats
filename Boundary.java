/**
 * User interface class, only shows output to user
 *
 * @author Aditya Kumar
 * @version 21/05/2019
 */
public class Boundary
{   
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
        System.out.println("2. Checkout");
        System.out.println("3. Exit");
    }
    
    /**
     * Shows the overall page
     */
    public void viewRestaurantList(int goBackNumber)
    {
        System.out.println("========================================================");
        System.out.println("                Viewing Restaurants");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select a restaurant or press " + goBackNumber + " to go back: ");
        System.out.println();
    }
    
    /**
     * Shows individual restaurant details
     * @param restaurantName The name of the restaurant
     * @param restaurantAddress The restaurant's address
     * @param rating The restaurant's rating
     */
    public void viewRestaurantDetailsForMenu(String restaurantName, String restaurantAddress, double rating, int iterator)
    {
        System.out.println( (iterator + 1) + ".\tName: " + restaurantName + " (" + rating + ")");
        System.out.println("\tAddress: "+ restaurantAddress);
        System.out.println();
    }
    
    
    public void viewRestaurantDetailsForMenuUnrated(String restaurantName, String restaurantAddress, int iterator)
    {
        System.out.println( (iterator + 1) + ".\tName: " + restaurantName + " (Unrated)");
        System.out.println("\tAddress: "+ restaurantAddress);
        System.out.println();
    }
    
    /**
     * Just displays "Go back to previous menu". Use inside a loop, with an iterator, after a println() call
     */
    public void goBackToPrevious(int iterator)
    {
        System.out.println( (iterator + 1) + ".\tGo back to previous menu");
        System.out.println();
        System.out.print(">>");
    }
    
    /**
     * Shows the menu page header, with restaurant name and address
     * @param restaurantName The name of the restaurant
     * @param restaurantAddress The restaurant's address
     */
    public void showMenu(String restaurantName, String restaurantAddress, int goBackOption)
    {
        System.out.println("========================================================");
        System.out.println("\t\t" + restaurantName);
        System.out.println("\tAddress: " + restaurantAddress);
        System.out.println("========================================================");
        System.out.println();
        System.out.println();// there should display the menu
        System.out.println();
        System.out.println("Please select items to add to cart or press " + goBackOption + " to go back to restaurant list: ");
        System.out.println();
       
    }
    
    /**
     * Shows the individual item in the menu
     * @param itemName The name of the food item
     * @param price The item's price
     * @param description The item's description
     */
    public void showItemDetails(String itemName, double price, String description, boolean deal, int iterator)
    {
        System.out.println( (iterator + 1) + ".\tFood Name: " + itemName);
        System.out.println("\tPrice: $" + price);
        System.out.println("\tDescription: " + description);
        if (deal)
            System.out.println("\tDeal: The price will be $" + (price * 0.8) + " instead");
        System.out.println();
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
        System.out.print(">>");
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
        System.out.println("3. Apply coupon");
        //System.out.println("4. Check out");//customer has been in the prograss of checking out in the page
        System.out.println("4. go back to previous page");
        System.out.println();
        System.out.print(">>");
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
        System.out.print(">>");
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
        System.out.println();
        System.out.print(">>");
    }
    
    public void showEnterCouponMessage()
    {
        System.out.println("========================================================");
        System.out.println("                       Apply coupon");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please enter the coupon code: ");
        System.out.println();
        System.out.print(">>");
    }
    
    public void couponAlreadyApplied()
    {
        System.out.println("Sorry, you can only use a coupon once per order.");
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
        System.out.println("4. Go back"); //go back to previous page
        System.out.println();
        System.out.println("Please enter the option: ");
        System.out.print(">>");
    }
    
    /**
     * Shows check Out Page information
     */
    public void ratingPage()
    {
        System.out.println("Please rate the restaurant");
        System.out.println("Please input the rating 1 to 5, 1 is the lowest");
        System.out.println(">>");
    }
    
    /**
     * Shows check Out Page information
     */
    public void showReceiptPage(String restaurantName,String restaurantAddress,String customerFirstName, String customerLastName, 
                               String customerAddress, String customerPhoneNumber, String date)
    {
        System.out.println("========================================================");
        System.out.println("                     Order Receipt");
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
    
    public void invalidInputError(int flag)
    {
        System.out.println("Invalid user input. Please enter an option from the menu.");
        if (flag == 1)
        {
            System.out.println("Input must be numbers only.");
        }
    }
    
    public void displayCartHeader()
    {
        System.out.println("========================================================");
        System.out.println("                       Shoping Cart");
        System.out.println("========================================================");
        System.out.println(String.format("%20s","Item Name"));
        System.out.println("\tPrice");
    }
    
    public void displayItemCart(int iterator, String name, double price)
    {
        System.out.println(String.format("%20s",(iterator+1) + "." + name) + "\t" + "$ " + price);
    }
    
    public void displayCartFooter(double totalPrice)
    {
        System.out.println();
        System.out.println(String.format("%20s","Delivery") + "\t$ 5.00");
        System.out.println(String.format("%20s","Total Price") + "\t$ " + totalPrice);
    }
    
    public void showCartFullError()
    {
        System.out.println();
        System.out.println("Cart already has 5 items. Please remove some items before adding more.");
    }
    
    public void showItemAdded(String itemName)
    {
        System.out.println();
        System.out.println(itemName+ " successfully added to cart!");
    }
    
    public void noItemsInCart()
    {
        System.out.println();
        System.out.println("There are no items in cart. Please add some items before checking out!");
    }
    
    public void askForAmount()
    {
        System.out.println();
        System.out.println("Please enter the payment amount: ");
    }
    
    public void invalidPaymentAmount()
    {
        System.out.println();
        System.out.println("Please enter an amount greater than 0 and less than the total amount!");
    }
    
    public void displayPending(double pending)
    {
        System.out.println();
        System.out.println("Pending amount: $" + pending);
        System.out.println();
    }
    
    public void afterPayment()
    {
        System.out.println();
        System.out.println("Please choose one of the following options:");
        System.out.println("1. View Receipt");
        System.out.println("2. Go back to home");
        System.out.println();
    }
       
    public void showReceiptDetails(String itemName, double price, String description, boolean deal, int iterator)
    {
        System.out.println( (iterator + 1) + ".\tFood Name: " + itemName);
        System.out.println("\tPrice: $" + price);
        System.out.println("\tDescription: " + description);
        if (deal)
            System.out.println("\tDeal: The price will be $" + (price * 0.8) + " instead");
        System.out.println();
    }
    
    public void showPaymentsMessage()
    {
        System.out.println();
        System.out.println("Payment details:");
    }
    
    public void showPayments(String method, double amount, int iterator)
    {
        System.out.println((iterator+1) + ". Paid by " + method + ": $" + amount);
    }
    
    public void showTotalPaid(double amount)
    {
        System.out.println();
        System.out.println("Total amount paid: $"+ amount);
    }
    
}
