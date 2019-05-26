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
        ShoppingCart carts = cart;       
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                me.displayCart(carts);
                break;
            case 2:
                me.selectPayment(carts);
                break;
            case 3:
                me.redeemCoupon(carts);
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
        String coupon = sc.nextLine();
        if (coupon.toUpperCase().equals("COUPON")) {
            double totalPrice = scart.getTotalPrice();
            totalPrice = totalPrice - 5.0;
            scart.setTotalPrice(totalPrice);
            selectPayment(carts);
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
    public void selectPaymet(ShoppingCart cart){
           ui.paymentPage();
           Scanner sc = new Scanner(System.in);
           int i = sc.nextInt();
           String pay="";
           if(i==1){
               pay="Card";
            }else{
                pay="Cash";
            }
           cart.setPayment(pay);
           afterPayment(carts);
    }
    public void selectPayment(ShoppingCart cart){
        ui.afterPaymentPage();
        ShoppingCart carts=cart;
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();
        switch(input){
            case 1:ui.displayCart(carts);selectPayment(carts);break;
            case 2:rating(carts);break;
            case 3:showRecipt(carts);break;
            case 4:checkOut(carts);break;
            default:break;
        }
    }
    public void rating(ShoppingCart cart){
        ui.ratingPage();
        Scanner sc = new Scanner(System.in);
        int input= sc.nextInt();
        rateRestaurant(resturant, input);
        System.exit(1);//
    }
    public void showRecipt(ShoppingCart cart){
        String restaurantName,restaurantAddress,customerFirstName, customerLastName, customerAddress, customerPhoneNumber, date;
        showReciptPage(restaurantName,restaurantAddress,customerFirstName, customerLastName, customerAddress, customerPhoneNumber, date);
    
    }
}