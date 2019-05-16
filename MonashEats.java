import java.util.*;

import javax.swing.filechooser.FileNameExtensionFilter;

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
        System.out.println("========================================================");
        System.out.println("\t\tWelcome to Monash Eats");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Exit");
        int homeAns = 0;
        do
                    {
                        //Customer account
                        System.out.println("========================================================");
                        System.out.println("           Customer Home");
                        System.out.println("========================================================");
                        System.out.println();
                        System.out.println("Please select one of the following options:");
                        System.out.println();
                        System.out.println("1. View restaurants");
                        System.out.println("2. View current cart");
                        System.out.println("3. Exit");
                        homeAns = input.nextInt();
                        input.nextLine(); //Clear the buffer
                        switch(homeAns){
                            case 1:break;
                            case 2:break;
                            case 3:System.exit(1);break;
                            default:break;
                        }
                        
                    } while (homeAns != 5);
                
           
    }
    
    public static void main(String[] args){
        MonashEats m = new MonashEats();
        m.startProgram();
    }
}