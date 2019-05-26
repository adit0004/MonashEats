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
    //private RestaurantList restaurantList;
    private ShoppingCart shoppingCart;
    private Boundary ui;
    private RestaurantList rl;

    /**
     * Default constructor for MonashEats
     */
    public MonashEats()
    {
        userList = new ArrayList<User>();
        rl = new RestaurantList();
        shoppingCart = new ShoppingCart();
        ui = new Boundary();
        
        
        // Add preloaded restaurants
        String restaurantName = "Derby Thai";
        String restaurantAddress = "4 Derby Road";
        String phone = "(03) 9571 1306";
        double rating = 4.5;
        
        rl.addNewRestaurant(restaurantName, restaurantAddress, phone, rating);
        
        restaurantName = "Tuck Shop";
        restaurantAddress = "273 Hawthorn Road";
        phone = "0431 406 580";
        rating = 4.6;
        
        rl.addNewRestaurant(restaurantName, restaurantAddress, phone, rating);
        
        // Create 5 items for Derby Thai and add to their menu
        String itemName = "Curry Puff (5 Pieces)";
        String itemDescription = "Golden pastry filled with delicious curry mix of chicken and potato";
        double price = 7.0;
        boolean onDeal = false;
        
        rl.get(0).addItemToMenu(itemName, itemDescription, price, onDeal);
        
        itemName = "Spring Roll (5 pieces)";
        itemDescription = "Chicken or Vegetable";
        price = 7.0;
        onDeal = true;
        
        rl.get(0).addItemToMenu(itemName, itemDescription, price, onDeal);
        
        itemName = "Green Curry";
        itemDescription = "Thai green curry paste cooked in coconut milk and vegetables with Chicken, Beef or Pork";
        price = 13.0;
        onDeal = false;
        
        rl.get(0).addItemToMenu(itemName, itemDescription, price, onDeal);
        
        itemName = "Massaman Curry";
        itemDescription = "Chicken, Beef or Pork with onions, potato, cashew nuts, dry chilli and herbs";
        price = 14.0;
        onDeal = false;
        
        rl.get(0).addItemToMenu(itemName, itemDescription, price, onDeal);
        
        itemName = "Steamed Jasmin Rice";
        itemDescription = "Bowl of steamed jasmin rice";
        price = 2.0;
        onDeal = false;
        
        rl.get(0).addItemToMenu(itemName, itemDescription, price, onDeal);
        
        // Create 5 items for Tuck Shop and add to their menu
        itemName = "Minor Burger";
        itemDescription = "";
        price = ;
        onDeal = false;
    }
    
    public MonashEats(ArrayList<User> newUserList, RestaurantList newRestaurantList, ShoppingCart newShoppingCart)
    {
        userList = newUserList;
        rl = newRestaurantList;
        shoppingCart = newShoppingCart;
        ui = new Boundary();
    }


    public static void main(String[] args) {
        MonashEats me = new MonashEats();
        me.startProgram();
        //ShoppingCart cart = new ShoppingCart();
        //me.checkOut(cart);
    }

    public void checkOut(ShoppingCart cart) {
        ui.checkOutPage();//show the check out page
        MonashEats me = new MonashEats();       
        ShoppingCart carts = new ShoppingCart();       
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                me.redeemCoupon(carts);
                break;
            case 2:
                me.afterPayment(1);
                break;
            case 3:
                me.afterPayment(2);
                break;
            case 4:
                checkOut(carts);
                break;
            default:
                break;
        }
    }

    private void redeemCoupon(ShoppingCart cart) {
        ShoppingCart scart = cart;
        ui.couponPage();//coupon page
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            String coupon = sc.nextLine();
            if (coupon.toUpperCase().equals("COUPON")) {
                double totalPrice = scart.getTotalPrice();
                totalPrice = totalPrice - 5.0;
                scart.setTotalPrice(totalPrice);
                boolean flag = true;
                ui.list(true);//to add coupon to create new page with coupon and change the total price
                ui.paymentPage();//after enter coupon code, show the payment option: card or cash
                int op = sc.nextInt();
                switch (op) {
                    case 1:afterPayment(1);//show the list or the receipt for the customer after pay by card
                        break;
                    case 2:afterPayment(2);//pay by cash
                        break;
                    default:
                        break;
                }
            }
        }else{
            checkOut(scart);//go back to the previous page
        }
    }

    private void afterPayment(int i) {
            ui.afterPaymentPage();
        Scanner sc = new Scanner(System.in);
        int ops =sc.nextInt();
        boolean flag = false;
        do{
            if(ops==1){
                ui.ratingPage();
            }else{
                ui.showReciptPage();
                int j = sc.nextInt();
                rl.rateRestaurant();
            }
        }while(flag);
    }

    /**
     * get User List
     * return ArrayList
     */
    public ArrayList getUserList()
    {
        return userList;
    }
    
    public void displayRestaurantList()
    {
        ui.viewRestaurantList();
        for (int i = 0; i < rl.getRestaurantCount(); i++)
        {
            ui.viewRestaurantDetailsForMenu(rl.getRestaurantName(i),rl.getRestaurantAddress(i),rl.getRestaurantRating(i),i);
        }
        
    }
    
    public void startProgram()
    {
        ui.customerHome();
        
        Scanner input = new Scanner(System.in);
        int homeAns = 0;
        while (homeAns != 3)
        {
            try 
            {
                homeAns = input.nextInt();
            }
            catch(Exception e)
            {
                ui.invalidInputError(1);
                continue;
            }
            
            if (homeAns == 1)
            {
                displayRestaurantList();
                
                int restaurantAns = 0;
                
                while(restaurantAns != 0 || restaurantAns != (rl.getRestaurantCount() + 1))
                {     
                    try 
                    {
                        homeAns = input.nextInt();
                    }
                    catch(Exception e)
                    {
                        ui.invalidInputError(1);
                        continue;
                    }
                    
                    if(restaurantAns == (rl.getRestaurantCount() + 1))
                    {
                        break;
                    }
                    
                    else if (restaurantAns < 0 || restaurantAns > (rl.getRestaurantCount() + 1))
                    {
                        ui.invalidInputError(0);
                        continue;
                    }
                    
                    else
                    {
                        ui.showMenu(rl.getRestaurantName(restaurantAns), rl.getRestaurantAddress(restaurantAns));
                    }
                    
                }
                
            }
            
            else if (homeAns == 2)
            {
                
            }
            
            else if (homeAns == 3)
            {
                System.out.println("Thank you for using Monash Eats.");
                System.exit(0);
            }
            else
            {
                ui.invalidInputError(0);
            }
        }
    }
}