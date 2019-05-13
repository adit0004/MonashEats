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
            welcomePage();

            ans = input.nextInt();
            input.nextLine(); //Clear the buffer
            //1:login
            if (ans == 1)
            {
                loginPage();

                String email = "";
                String password = "";

                System.out.println("Please enter your email address:");
                email = input.nextLine().trim();
                System.out.println("Please enter your password:");
                password = input.nextLine().trim();

                // To do:
                // Process this login

                int indexOfAccount = getIndexOfAccount(email);
                String accountType = userList.get(indexOfAccount).getAccountType().toLowerCase();
                String rightPassword = userList.get(indexOfAccount).getPassword();

                if (accountType.equals("admin")&&password.equals("Admin"))
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
                else if (accountType.equals("owner")&&password.equals("Owner"))
                {
                    ownerHome();

                }
                else if (accountType.equals("customer")&&password.equals("Customer"))
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
                else
                {
                    System.out.println("This account is not valid! Please Try again!\n");
                    startProgram();
                }
            }
            else if (ans == 2)// 2 sign up
            {
                registerPage();
            }
            else if(ans == 3) // 3 log out
                System.exit(1);
            else
            {
                System.out.println("Invalid input. Please enter from 1 to 3.");
            }
        } while( ans != 3 );
    }

    public int getUserListSize()
    {
        return userList.size();
    }

    /**
     * input an String - email address
     * get the index of the user who has the same email address in userList
     * return the index(int)
     * If userList does not have the eamil address
     * Show the message "don't have the account"
     * return the -1
     */
    public int getIndexOfAccount(String inputEmail)
    {
        int index = -1;
        int userListSize = getUserListSize();
        inputEmail = inputEmail.trim().toLowerCase();
        if (userListSize != 0)
        {
            for(int i = 0; i < userListSize; i++)
            {
                String email = userList.get(i).getEmail();
                if (inputEmail.equals(email))
                {
                    index = i;
                    break;
                }
            }
            if (index == -1)
            {
                System.out.println("Don't have the account, please register first");
            }
        }
        else
        {
            System.out.println("Don't have the account, please register first");
        }
        return index;
    }

    public void welcomePage()
    {
        System.out.println("========================================================");
        System.out.println("\t\tWelcome to Monash Eats");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select one of the following options:\n\n1. Login\n2. Sign-up\n3. Exit");

    }

    public void loginPage()
    {
        System.out.println("========================================================");
        System.out.println("\t\t\tLogin");
        System.out.println("========================================================");
        System.out.println();

        Scanner input = new Scanner(System.in);
        String email = "";
        String password = "";
        int indexOfAccount = -1;
        String accountType = "";
        String rightPassword = "";

        do
        {
            do
            {
                System.out.println("Please enter your email address:");
                email = input.nextLine().trim();
                System.out.println("Please enter your password:");
                password = input.nextLine().trim();

                indexOfAccount = getIndexOfAccount(email);

                if(indexOfAccount == -1)
                    System.out.println("Wrong account! Please input again.");

            }while(indexOfAccount == -1); //Check the email is exist in user list

            rightPassword = userList.get(indexOfAccount).getPassword();

        }while(password.equals(rightPassword)); //Check the password is right

        accountType = userList.get(indexOfAccount).getAccountType().toLowerCase();

        switch(accountType)
        {
            case "admin": break;
            case "owner": ownerHome(); break;
            case "customer": break; 
        }

    }

    public void registerPage()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.println("\t\tWelcome to register a Monash Eats account");
        System.out.println("========================================================");
        System.out.println();

        System.out.println("What type of account do you want to register?");
        System.out.println("1. Owner");
        System.out.println("2. Customer");
        System.out.println("Please enter the option 1 or 2");

        String option = "";
        String accountType = "";
        do
        {
            option = input.nextLine();
            if (option.equals("1"))
                accountType = "owner";
            else if(option.equals("2"))
                accountType = "customer";
            else
                System.out.println("Wrong input! Please enter option 1 or 2");
        }while(option.equals("1") && option.equals("2"));

        System.out.println("Please enter your first name");
        String fname = input.nextLine();

        System.out.println("Please enter your last name");
        String lname = input.nextLine();

        System.out.println("Please enter your phone number");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter your email");
        String email = input.nextLine();

        System.out.println("Please enter your password");
        String password = input.nextLine();

        String address = "";
        if(accountType.equals("customer"))
        {
            System.out.println("Please enter your address");
            address = input.nextLine();
            User user = new Customer(fname, lname, phoneNumber, email, password, accountType, address, false);
            userList.add(user);
        }

        User user = new User(fname, lname, phoneNumber, email, password, accountType);
        userList.add(user);

        System.out.println("Register successfully! Turn to login page? [y/n]");
        String back= input.nextLine();

        if(back.toUpperCase().equals("Y"))
            loginPage();
        else
            System.exit(1);                    
    }

    public void ownerHome()
    {
        System.out.println("========================================================");
        System.out.println("           Owner Home");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Please select one of the following options:");
        System.out.println();
        System.out.println("1. Manage owner details");
        System.out.println("2. Manage restaurants");
        System.out.println("3. Logout");
        System.out.println();

        Scanner input = new Scanner(System.in);

        String option = input.nextLine();// loop need to be added

        switch(option)
        {
            case "1":  break;
            case "2": manageRestaurant(); break;
            case "3": startProgram();break;
            default: System.out.println("Wrong option! Please input from 1 to 4");
        }
    }

    public void manageAccountDetails(int index)
    {
        System.out.println("========================================================");
        System.out.println("           Account Detail");
        System.out.println("========================================================");
        System.out.println();

        String accountType = userList.get(index).getAccountType();
        if(accountType.equals("customer"))
            userList.get(index).display();
        System.out.println();
        System.out.println("Which attribute do you want to change?");
        System.out.println("1. First name ");
        System.out.println("2. Last name ");
        System.out.println("3. Phone number ");
        System.out.println("4. email ");
        System.out.println("5. password ");
        if(accountType.equals("customer"))
        {}

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
        System.out.println("3. Edit restaurant details");
        System.out.println("4. Manage menu");
        System.out.println("5. go back");

        Scanner input = new Scanner(System.in);
        String option = input.nextLine();

        switch(option)
        {
            case "1":  break;
            case "2": break;
            case "3": break;
            case "4": break;
            case "5": break;
            default: System.out.println("Wrong option! Please input from 1 to 5");
        }
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