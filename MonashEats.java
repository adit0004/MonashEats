
import java.util.*;

/**
 * The control class for Monash Eats. This class also behaves like the boundary
 * class, handling IO between the user and the system.
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */

public class MonashEats {

    private ArrayList<User> userList;
    //private RestaurantList restaurantList;
    private ShoppingCart shoppingCart;
    private Boundary ui;
    private RestaurantList rl;
    private User currentUser;
    private Order order;

    /**
     * Default constructor for MonashEats
     */
    public MonashEats() {
        userList = new ArrayList<User>();
        rl = new RestaurantList();
        shoppingCart = new ShoppingCart();
        ui = new Boundary();
        //Create customer
        currentUser = new Customer("Tom", "Cruise", "0400 000 000", "tomcruise@gmail.com", "MissionImpossible", "Customer", "CIA Headquarters", false, true);
        generateData();
    }

    public void generateData() {

        // Add preloaded restaurants
        String restaurantName = "Derby Thai";
        String restaurantAddress = "4 Derby Road";
        String phone = "(03) 9571 1306";
        double rating = 4.5;
        int rateCount = 3;
        
        rl.addNewRestaurant(restaurantName, restaurantAddress, phone, rating, rateCount);

        restaurantName = "Tuck Shop";
        restaurantAddress = "273 Hawthorn Road";
        phone = "0431 406 580";
        rating = 4.6;

        rl.addNewRestaurant(restaurantName, restaurantAddress, phone, rating, rateCount);

        // Create 5 items for Derby Thai and add to their menu
        String itemName = "Curry Puff (5 Pieces)";
        String itemDescription = "Golden pastry filled with delicious curry mix of chicken and potato";
        double price = 7.0;
        boolean onDeal = false;

        rl.getRestaurant(0).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Spring Roll (5 pieces)";
        itemDescription = "Chicken or Vegetable";
        price = 7.0;
        onDeal = true;

        rl.getRestaurant(0).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Green Curry";
        itemDescription = "Thai green curry paste cooked in coconut milk and vegetables with Chicken, Beef or Pork";
        price = 13.0;
        onDeal = false;

        rl.getRestaurant(0).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Massaman Curry";
        itemDescription = "Chicken, Beef or Pork with onions, potato, cashew nuts, dry chilli and herbs";
        price = 14.0;
        onDeal = false;

        rl.getRestaurant(0).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Steamed Jasmin Rice";
        itemDescription = "Bowl of steamed jasmin rice";
        price = 2.0;
        onDeal = false;

        rl.getRestaurant(0).addItemToMenu(itemName, itemDescription, price, onDeal);

        // Create 5 items for Tuck Shop and add to their menu
        itemName = "Minor Burger";
        itemDescription = "Beef patty, onion, lettuce, tomato, cheddar";
        price = 11.0;
        onDeal = false;

        rl.getRestaurant(1).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Major Burger";
        itemDescription = "Minor burger with double patty and double cheese";
        price = 14.50;
        onDeal = false;

        rl.getRestaurant(1).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "The cuts";
        itemDescription = "Hand cut triple cooked chips";
        price = 6.0;
        onDeal = true;

        rl.getRestaurant(1).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Three cheese jaffles";
        itemDescription = "Parmesan, Cheddar and fontina";
        price = 8.50;
        onDeal = true;

        rl.getRestaurant(1).addItemToMenu(itemName, itemDescription, price, onDeal);

        itemName = "Spaghetti Bolognaise";
        itemDescription = "Homemade spaghetti with meat sauce";
        price = 13.50;
        onDeal = false;
    }

    public MonashEats(ArrayList<User> newUserList, RestaurantList newRestaurantList, ShoppingCart newShoppingCart) {
        userList = newUserList;
        rl = newRestaurantList;
        shoppingCart = newShoppingCart;
        ui = new Boundary();
    }

    public void startProgram() {
        int homeAns = 0;
        int selectedRestaurant = -1;
        while (homeAns != 3) {
            ui.customerHomePage();
            System.out.print(">>");
            Scanner input = new Scanner(System.in);
            try {
                homeAns = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                ui.invalidInputError(1);
            }

            if (homeAns == 3) {
                System.exit(1);
            }

            if (homeAns == 1) {

                int restaurantListAnswer = 0;

                do {

                    ui.viewRestaurantList(rl.getRestaurantCount() + 1);
                    int lastIterator = 0;
                    for (int i = 0; i < rl.getRestaurantCount(); i++) {
                        if (rl.getRestaurantRateCount(i) != 0)
                            ui.viewRestaurantDetailsForMenu(rl.getRestaurantName(i), rl.getRestaurantAddress(i), rl.getRestaurantRating(i), i);
                        else 
                            ui.viewRestaurantDetailsForMenuUnrated(rl.getRestaurantName(i), rl.getRestaurantAddress(i), i);
                        lastIterator += 1;
                    }
                    ui.goBackToPrevious(lastIterator);

                    try {
                        restaurantListAnswer = input.nextInt();
                        input.nextLine();
                    } catch (Exception e) {
                        ui.invalidInputError(1);
                    }

                    if (restaurantListAnswer != (lastIterator + 1)) {
                        //Show menu
                        selectedRestaurant = restaurantListAnswer - 1;
                        int itemToAdd = 0;
                        while (itemToAdd != rl.getRestaurant(selectedRestaurant).getMenuCount() + 1) {

                            ui.showMenu(rl.getRestaurantName(selectedRestaurant), rl.getRestaurantAddress(selectedRestaurant), (rl.getRestaurant(selectedRestaurant).getMenuCount() + 1));
                            for (int i = 0; i < rl.getRestaurant(selectedRestaurant).getMenuCount(); i++) {
                                //Get item name, price, desc, deal

                                //order.setRestaurant(rl.getRestaurant(selectedRestaurant));
                                ui.showItemDetails(
                                        rl.getRestaurant(selectedRestaurant).getItemName(i),
                                        rl.getRestaurant(selectedRestaurant).getItemPrice(i),
                                        rl.getRestaurant(selectedRestaurant).getItemDescription(i),
                                        rl.getRestaurant(selectedRestaurant).getDeal(i),
                                        i
                                );
                            }
                            ui.goBackToPrevious(rl.getRestaurant(selectedRestaurant).getMenuCount());

                            try {
                                itemToAdd = input.nextInt();
                            } catch (Exception e) {
                                ui.invalidInputError(1);
                            }

                            if (itemToAdd == rl.getRestaurant(selectedRestaurant).getMenuCount() + 1) {
                                break;
                            }

                            if (itemToAdd < rl.getRestaurant(selectedRestaurant).getMenuCount() + 1 && itemToAdd >= 1) {
                                // Valid item was selected, add to cart
                                int checkIfAdded = shoppingCart.addItems(rl.getRestaurant(selectedRestaurant).getItem(itemToAdd));
                                if (checkIfAdded == -1) {
                                    ui.showCartFullError();
                                } else {
                                    ui.showItemAdded(rl.getRestaurant(selectedRestaurant).getItemName(itemToAdd - 1));
                                }
                            }

                            if (itemToAdd > rl.getRestaurant(selectedRestaurant).getMenuCount() + 1 || itemToAdd < 1) {
                                // Invalid option
                                ui.invalidInputError(0);
                            }
                        }

                    } else if (restaurantListAnswer == (lastIterator + 1)) {
                        ui.customerHomePage();
                        System.out.print(">>");
                        break;

                    } else {
                        ui.invalidInputError(0);
                    }

                } while (true);

            } else if (homeAns == 2) {
                //User pressed checkout, check if there are items in cart
                if (shoppingCart.getItemsCount() == 0) {
                    //Show cart empty
                    ui.noItemsInCart();
                }
                
                else
                {
                    int checkOutAns = 0;
                    boolean flag = false;
                    double paidAmount = 0.0;
                    double pendingAmount = shoppingCart.getTotalPrice();
                    order = new Order();
                    order.setCustomer(currentUser);
                    order.setItems(shoppingCart.getItemList());
                    while(pendingAmount != 0)
                    {
                        ui.checkOutPage();
                        ui.displayPending(pendingAmount);
                        try
                        {
                            checkOutAns = input.nextInt();
                            input.nextLine();
                        }
                        catch(Exception e)
                        {
                            ui.invalidInputError(1);
                        }
                        
                        if(checkOutAns < 1 || checkOutAns > 4)
                        {
                            ui.invalidInputError(0);
                            checkOutAns = 0;
                            continue;
                        }
                        
                        else {
                            switch(checkOutAns)
                            {
                                case 1:
                                        displayCart();
                                        break;
                                case 2:
                                        ui.paymentPage();
                                        int paymentChoice = 0;
                                        try
                                        {
                                            paymentChoice = input.nextInt();
                                            input.nextLine();
                                        }
                                        catch(Exception e)
                                        {
                                            ui.invalidInputError(1);
                                        }
                                        
                                        if (paymentChoice != 1 && paymentChoice != 2)
                                        {
                                            ui.invalidInputError(0);
                                            break;
                                        }
                                        else
                                        {
                                            ui.askForAmount();
                                            double amount = 0.0;
                                            try
                                            {
                                                amount = input.nextDouble();
                                                input.nextLine();
                                            }
                                            catch(Exception e)
                                            {
                                                ui.invalidInputError(0);
                                            }
                                            
                                            //Check is amount is greater than 0 and less than total, and less than what is remaining
                                            if (amount > 0 && amount <= shoppingCart.getTotalPrice() && amount <= pendingAmount)
                                            {
                                                //If yes, create new payment
                                                String method = "Cash";
                                                if (paymentChoice == 1)
                                                {
                                                    method = "Card";
                                                }
                                                order.addPayment(method, amount);
                                                pendingAmount -= amount;
                                            }
                                            else
                                            {
                                                ui.invalidPaymentAmount();
                                            }
                                        }
                                        
                                        break;
                                case 3:
                                        //Check if coupon applied already
                                        if (order.checkCoupon())
                                        {
                                            ui.couponAlreadyApplied();
                                            continue;
                                        }
                                        else
                                        {
                                            ui.showEnterCouponMessage();
                                        }
                                        String couponCode = input.nextLine();
                                        if(couponCode.toUpperCase().equals("CHEAP"))
                                        {
                                            order.addCouponPayment();
                                            pendingAmount -= 5;
                                        }
                                        break;
                                default:
                                        ui.invalidInputError(0);
                            }
                        }
                        
                    }
                    
                    //If pending is 0, ask for rating
                    if(pendingAmount == 0)
                    {
                        ui.ratingPage();
                        int rating = 0;
                        while(rating <= 0 || rating > 5)
                        {
                            try
                            {
                                rating = input.nextInt();
                                input.nextLine();
                            }
                            catch(Exception e)
                            {
                                continue;
                            }
                            
                            //Got rating, update
                            rl.getRestaurant(selectedRestaurant).newRating(rating);
                        }
                        
                        int afterPaymentOption = 0;
                        do
                        {
                            ui.afterPayment();
                            try
                            {
                                afterPaymentOption = input.nextInt();
                                input.nextLine();
                            }
                            catch(Exception e)
                            {
                                ui.invalidInputError(1);
                            }
                            
                            if (afterPaymentOption == 1 || afterPaymentOption == 2)
                            {
                                rl.getRestaurant(selectedRestaurant).addOrder(order);
                            }
                            
                            if (afterPaymentOption == 1)
                            {
                                //Show receipt
                                ui.showReceiptPage(rl.getRestaurantName(selectedRestaurant), rl.getRestaurantAddress(selectedRestaurant), order.getCustomer().getFirstName(),
                                    order.getCustomer().getLastName(), order.getCustomer().getAddress(), order.getCustomer().getPhoneNumber(), order.getOrderDateTime());
                                
                                for (int i = 0 ; i < order.getItemCount() ; i++)
                                {
                                    double price = order.getItemPrice(i);
                                    boolean onDeal = order.getDeal(i);
                                    if (onDeal)
                                    {
                                        price = price * 0.8;
                                    }
                                    ui.showReceiptDetails(order.getItemName(i), price, order.getItemDescription(i), onDeal, i);
                                }
                                
                                ui.showPaymentsMessage();
                                double total = 0;
                                
                                for (int i = 0 ; i < order.getPaymentCount() ; i++)
                                {
                                    ui.showPayments(order.getPaymentMethod(i), order.getAmount(i) ,i);
                                    total += order.getAmount(i);
                                }
                                
                                ui.showTotalPaid(total);
                                
                            }
                            else if(afterPaymentOption == 2)
                            {
                                //Go to home
                                startProgram();
                            }
                            
                        }while (afterPaymentOption != 1 || afterPaymentOption != 2);
                    }
                    
                }

                checkOut();
            } else {
                ui.invalidInputError(0);
            }

        }
    }

    public static void main(String[] args) {
        MonashEats me = new MonashEats();
        me.startProgram();
        //ShoppingCart cart = new ShoppingCart();
        //me.checkOut(cart);
    }

    public void displayCart() {
        ui.displayCartHeader();
        for (int i = 0; i < shoppingCart.getItemsCount(); i++) {
            String itemName = shoppingCart.getItemName(i);
            double price = shoppingCart.getItemPrice(i);
            ui.displayItemCart(i, itemName, price);
        }
        ui.displayCartFooter(shoppingCart.getTotalPrice());
    }

    public void checkOut() {
        boolean flag = false;
        do
        {
            ui.checkOutPage();//show the check out page
            //ShoppingCart carts = cart;       
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    displayCart();
                    break;
                case 2:
                    break;
                case 3:
                    redeemCoupon();
                    break;
                case 4:
                    //checkOut(shoppingCart);
                    break;
                default:
                    break;
            }
        } while (flag == false);
    }

    public void redeemCoupon() {
        ui.couponPage();//coupon page
        Scanner sc = new Scanner(System.in);
        String coupon = sc.nextLine();
        if (coupon.toUpperCase().equals("CHEAP")) {
            double totalPrice = shoppingCart.getTotalPrice();
            totalPrice = totalPrice - 5.0;
            shoppingCart.setTotalPrice(totalPrice);
        }
    }

    /**
     * get User List return ArrayList
     */
    public ArrayList getUserList() {
        return userList;
    }

    public void showRecipt() {
        String restaurantName, restaurantAddress, customerFirstName, customerLastName, customerAddress, customerPhoneNumber, date;
        //ui.showReciptPage(restaurantName,restaurantAddress,customerFirstName, customerLastName, customerAddress, customerPhoneNumber, date);

    }
}