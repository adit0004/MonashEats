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
    private RestaurantList restaurantList;
    private ShoppingCart shoppingCart;

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
            //1:login
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
                    Admin admin = new Admin();
                    System.out.println("========================================================");
                    System.out.println("           Admin Home");
                    System.out.println("========================================================");
                    System.out.println();
                    System.out.println("Please select one of the following options:");
                    System.out.println();
                    System.out.println("1. Manage restaurants");
                    System.out.println("2. Manage account");
                    System.out.println("3. Logout");
                    System.out.println();
                    int option = input.nextInt();
                    switch(option){
                        case 1:manageRes();break;
                        case 2:manageAcc();break;
                        case 3:startProgram();break;
                        default: System.out.println("Wrong!");
                    }
                }
                else if (email.equals("owner@monash.edu")&&password.equals("Owner"))
                {
                    System.out.println("========================================================");
                    System.out.println("           Owner Home");
                    System.out.println("========================================================");
                    System.out.println();
                    System.out.println("Please select one of the following options:");
                    System.out.println();
                    System.out.println("1. Manage orders");
                    System.out.println("2. Manage restaurants");
                    System.out.println("3. Manage Menus");
                    System.out.println("4. Logout");
                    System.out.println();
                    String option = input.nextLine();
                    /**switch(option){
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:startProgram();break;
                    default: System.out.println("Wrong!");
                    }*/
                    if (option.equals("1"))
                    {
                        System.out.println("========================================================");
                        System.out.println("            View Orders");
                        System.out.println("========================================================");
                        System.out.println();
                        System.out.println("Order Details:");
                        System.out.println();

                        input.nextLine();

                    }
                    else if(option.equals("2"))
                    {
                        System.out.println("========================================================");
                        System.out.println("            Manage restaurants");
                        System.out.println("========================================================");
                        System.out.println();
                        System.out.println("Restaurants Details:");
                        System.out.println();
                        System.out.println("1. Update name");
                        System.out.println("2. Update address");
                        System.out.println("3. go back");

                        input.nextLine();

                    }
                    else if(option.equals("3"))
                    {
                        System.out.println("========================================================");
                        System.out.println("            Manage menu");
                        System.out.println("========================================================");
                        System.out.println();
                        System.out.println("Menu Details:");
                        System.out.println();
                        System.out.println("Please select a restaurant to manage menu for:");
                        System.out.println("Restruant Details: ");
                    }
                    else if  (email.equals("customer@monash.edu")&&password.equals("Customer"))
                    {
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
                            System.out.println("3. View profile");
                            System.out.println("4. View past orders");
                            System.out.println("5. Logout");

                            homeAns = input.nextInt();
                            input.nextLine(); //Clear the buffer

                            if (homeAns == 1)
                            {
                                int restaurantAns = 0;
                                do
                                {
                                    System.out.println("========================================================");
                                    System.out.println("                Viewing Restaurants");
                                    System.out.println("========================================================");
                                    System.out.println();
                                    System.out.println("Please select a restaurant to see their menu:");
                                    System.out.println();
                                    System.out.println("1.\tRestaurant A (Rating: 4.3)");
                                    System.out.println("\t123 Street Name, Caulfield East, 3000");
                                    System.out.println();
                                    System.out.println("2.\tRestaurant B (Rating: 3.0)");
                                    System.out.println("\t456 Street Name, Caulfield East, 3000");
                                    System.out.println();
                                    System.out.println("3.\tRestaurant C (Rating: 5.0)");
                                    System.out.println("\t789 Street Name, Caulfield East, 3000");

                                    restaurantAns = input.nextInt();
                                    input.nextLine();

                                    System.out.println("========================================================");
                                    System.out.println("                    Restaurant A");
                                    System.out.println("      123 Street Name, Caulfield East, 3000");
                                    System.out.println("========================================================");
                                    System.out.println("");
                                    System.out.println("Please select an item to add to cart:");
                                    System.out.println("1.\tFood Name: Curry Chicken\n\tPrice: $5");
                                    System.out.println("\tDescription: It is curry + chicken\n\tDeal: The price will be $4 instead");

                                } while (restaurantAns != 0);
                            }
                        } while (homeAns != 5);
                    }
                    else{
                        System.out.println("This account is not valid! Please Try again!\n");
                        startProgram();
                    }
                }
                else if (ans == 2)//2 sign up
                {
                    System.out.println("Please enter your fname");
                    String fname=input.nextLine();
                    System.out.println("Please enter your lname");
                    String lname=input.nextLine();
                    System.out.println("Please enter your phoneNumber");
                    String phoneNumber=input.nextLine();
                    System.out.println("Please enter your email");
                    email=input.nextLine();
                    System.out.println("Please enter your password");
                    password=input.nextLine();
                    //System.out.println("Please enter your password");
                    input.nextLine();
                    User user = new User();
                    user.setFirstName(fname);
                    user.setLastName(lname);
                    user.setPhoneNumber(phoneNumber);
                    user.setEmail(email);
                    user.setPassword(password);
                    user.setAccountType("");
                    userList.add(user);
                    System.out.println("Register successfully! Turn to login page? [y/n]");
                    String back= input.nextLine();
                    input.nextLine();
                    email = "";
                    password = "";
                    if(back.toUpperCase().equals("Y")){
                        startProgram();
                    }else{
                        System.exit(1);                    
                    }
                }
                else if(ans == 3){
                    System.exit(1);
                }
                else
                {
                    System.out.println("Invalid input. Please select from one of the menu options.");
                }
            }
        } while( ans != 3 );
    }

    public int getUserListSize()
    {
        return userList.size();
    }

    public String getAccountType(String inputAddress)
    {
        String accountType = null;
        int userListSize = getUserListSize();
        inputAddress = inputAddress.trim().toLowerCase();
        if (userListSize != 0)
        {
            for(int i = 0; i < userListSize; i++)
            {
                String email = userList.get(i).getEmail();
                if (inputAddress.equals(email))
                {
                    accountType = userList.get(i).getAccountType();
                    break;
                }
            }
            if (accountType == null)
            {
                System.out.println("Don't have the account, please register first");
            }
        }
        else
        {
            System.out.println("Don't have the account, please register first");
        }
        return accountType;
    }

    public void manageRestaurant()
    {
        System.out.println("========================================================");
        System.out.println("            Manage restaurants");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Restaurants Details:");
        System.out.println();
        
        System.out.println("Please choose one of the options");
        System.out.println();
        System.out.println("1. Add a restaurant");
        System.out.println("2. Remove a restaurant");
        System.out.println("3. Edit restaurant");
        System.out.println("4. go back");
        
        System.out.println("Please choose one of the restaurants");
        
        Scanner input = new Scanner(System.in);
        input.nextLine();
        
    }

    public void manageRes(){
        System.out.println("========================================================");
        System.out.println("           Admin Home");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select one of the following options:");
        System.out.println();
        System.out.println("1. Add existing restaurants");
        System.out.println("2. View existing restaurants");
        System.out.println("3. Edit existing restaurants");
        System.out.println("4. Delete existing restaurants");
        System.out.println("5. Go back\n");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int i =input.nextInt();
        switch(i){
            case 1:
            System.out.println("Restaurant Name: ");
            System.out.println("Restaurant Address: ");
            System.out.println("Restaurant D added!");
            break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            default:break;
        }
    }

    public void manageAcc(){
        startProgram();
    }

    public static void main(String[] args)
    {
        MonashEats monashEats = new MonashEats();
        monashEats.startProgram();
    }
}