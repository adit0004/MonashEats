import java.util.ArrayList;

/**
 * Objects of this class hold an entire order, one customer's details 
 * 
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class Order
{
   String orderDateTime;
   ArrayList<Items> items;
   String orderStatus;
   String paymentStatus;
   ArrayList<Payment> payment;
   
   /**
    * Default constructor for order
    */
   public Order()
   {
       orderDateTime = java.time.LocalDate.now() + " " + java.time.LocalTime.now();  
       items = new ArrayList<Items>();
       orderStatus = "Order placed";
       paymentStatus = "Unpaid";
       payment = new ArrayList<Payment>();
   }
   
   public Order(String newOrderDateTime, ArrayList<Items> newItems, String newOrderStatus, String newPaymentStatus, ArrayList<Payment> newPayment)
   {
       orderDateTime = newOrderDateTime;
       items = newItems;
       orderStatus = newOrderStatus;
       paymentStatus = newPaymentStatus;
       payment = newPayment;
   }
   
   public String getOrderDateTime()
   {
       return orderDateTime;
   }
   
   public ArrayList<Items> getItems()
   {
       return items;
   }
   
   public String getOrderStatus()
   {
       return orderStatus;
   }
   
   public String getPaymentStatus()
   {
       return paymentStatus;
   }
   
   public ArrayList<Payment> getPayment()
   {
       return payment;
   }
   
   public void setOrderDateTime(String newOrderDateTime)
   {
       orderDateTime = newOrderDateTime;
   }
   
   public void setItems(ArrayList<Items> newItems)
   {
       items = newItems;
   }
   
   public void setOrderStatus(String newOrderStatus)
   {
       orderStatus = newOrderStatus;
   }
   
   public void setPaymentStatus(String newPaymentStatus)
   {
       paymentStatus = newPaymentStatus;
   }
   
   public void setPayment(ArrayList<Payment> newPayment)
   {
       payment = newPayment;
   }
   
   public void generateReceipt()
   {
       System.out.println("========================================================");
       System.out.println("                     Order Receipt");
       System.out.println("========================================================");
       System.out.println();
       System.out.println("Restaurant A");
       System.out.println("123 Street Name,");
       System.out.println("Caulfield East, 3000");
       System.out.println();
       System.out.println("--------------------------------------------------------");
       System.out.println();
       System.out.println("Customer: Aditya Kumar");
       System.out.println("\tadit0004@student.monash.edu");
       System.out.println("\t345, Street Name 2,");
       System.out.println("\tCaulfield North, 3001");
       System.out.println();
       System.out.println("Order Date: 24-03-2019");
       System.out.println("------------------------------------------------------------------");
       System.out.println("Item\t\t\tPrice\t\t\tTotal");
       System.out.println("------------------------------------------------------------------");
       System.out.println("Curry Chicken\t\t$4\t\t\t$4");
       System.out.println("Delivery Charges\t$5\t\t\t$5");
       System.out.println();
       System.out.println("Order Subtotal\t\t\t\t\t$9");
       System.out.println();
       System.out.println("------------------------------------------------------------------");
       System.out.println();
       System.out.println("Order Total\t\t\t\t\t$9");
   }
   public void orderDetails()
   {
       System.out.println("========================================================");
       System.out.println("                     Order Details");
       System.out.println("========================================================");
       System.out.println();
       System.out.println("Customer: Aditya Kumar");
       System.out.println("\tadit0004@student.monash.edu");
       System.out.println("\t345, Street Name 2,");
       System.out.println("\tCaulfield North, 3001");
       System.out.println();
       System.out.println("Order Date: 24-03-2019");
       System.out.println("Order Status: Preparing");
       System.out.println("Payment Status: Paid");
       System.out.println("------------------------------------------------------------------");
       System.out.println("Item\t\t\tPrice\t\t\tTotal");
       System.out.println("------------------------------------------------------------------");
       System.out.println("Curry Chicken\t\t$4\t\t\t$4");
       System.out.println("Delivery Charges\t$5\t\t\t$5");
       System.out.println();
       System.out.println("Order Subtotal\t\t\t\t\t$9");
       System.out.println();
       System.out.println("------------------------------------------------------------------");
       System.out.println();
       System.out.println("Order Total\t\t\t\t\t$9");
   }
}
