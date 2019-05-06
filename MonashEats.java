import java.util.*;

/**
 * The control class for Monash Eats. This class also behaves like the boundary class, handling IO between the user and the system.
 * @author Aditya Kumar
 * @version 5/5/2019 
 */

public class MonashEats
{
    private ArrayList<User> userList;
    RestaurantList restaurantList;
    ShoppingCart shoppingCart;

    /**
     * Default constructor for MonashEats
     */
    public MonashEats()
    {
        userList = new ArrayList<User>();
        restaurantList = new RestaurantList();
        shoppingCart = new ShoppingCart();
    }
    
    public MonashEats(ArrayList<User> newUserList, RestaurantList newRestaurantList, ShoppingCart newShoppingCart)
    {
        userList = newUserList;
        restaurantList = newRestaurantList;
        shoppingCart = newShoppingCart;
    }
    
    public void startProgram()
    {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        
        do
        {
            System.out.println("========================================================");
            System.out.println("\t\tWelcome to Monash Eats");
            System.out.println("========================================================");
            System.out.println();
            System.out.println("Please select one of the following options:\n\n1. Login\n2. Sign-up\n3. Exit");
            
            ans = input.nextInt();
            input.nextLine(); //Clear the buffer
            
            if (ans == 1)
            {
                String email = "";
                String password = "";
                System.out.println("========================================================");
                System.out.println("\t\t\tLogin");
                System.out.println("========================================================");
                System.out.println();
                System.out.println("Please enter your email address:");
                email = input.nextLine();
                System.out.println("Please enter your password:");
                password = input.nextLine();
                
                // To do:
                // Process this login
                
                if (email.equals("admin1@monash.edu")&&password.equals("Admin"))
                {
                    //Admin account
                }
                else if (email.equals("owner@monash.edu")&&password.equals("Owner"))
                {
                    //Owner account
                }
                else
                {
                    int homeAns = 0;
                    do
                    {
                        //Customer account
                        System.out.println("========================================================");
                        System.out.println("		   Customer Home");
                        System.out.println("========================================================");
                        System.out.println();
                        System.out.println("Please select one of the following options:");
                        System.out.println();
                        System.out.println("1. View restaurants");
                        System.out.println("2. View current cart");
                        System.out.println("3. View profile");
                        System.out.println("4. View past orders");
                        System.out.println("5. Logout");
                        
                        homeAns = input.nextInt();
                        input.nextLine(); //Clear the buffer
                        
                    } while (homeAns != 5);
                }
            }
            else if (ans == 2)
            {
                //Sign up
            }
            else if (ans != 3)
            {
                System.out.println("Invalid input. Please select from one of the menu options.");
            }
        } while (ans != 3);
    }
}