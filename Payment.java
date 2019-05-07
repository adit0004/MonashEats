/**
 * The class to handle payments
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class Payment
{
   private double paymentAmount;
   private String paymentMethod;
   
   public Payment()
   {
       paymentAmount = 0.0;
       paymentMethod = "Cash";
   }
   
   public Payment(double newAmount, String newMethod)
   {
       paymentAmount = newAmount;
       paymentMethod = newMethod;
   }
   
   public void showPayment()
   {
       System.out.println("Payment details");
       System.out.println("-----------------------------------------------");
       System.out.println();
       System.out.println("Payment amount : $5.00");
       System.out.println("Payment method : Cash");
   }
}
