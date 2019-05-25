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
    public Boundary ui;
    public RestaurantList rl;

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

    public static void main(String[] args) {
        MonashEats me = new MonashEats();
        ShoppingCart cart = new ShoppingCart();
        me.checkOut(cart);
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
}