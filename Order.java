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
   
   public String generateReceipt()
   {
       String receipt = "";
       
       return receipt;
   }
}
