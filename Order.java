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
   User customer;
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

    public Order(String orderDateTime, ArrayList<Items> items, String orderStatus, String paymentStatus, ArrayList<Payment> payment, User customer) {
        this.orderDateTime = orderDateTime;
        this.items = items;
        this.orderStatus = orderStatus;
        this.paymentStatus = paymentStatus;
        this.payment = payment;
        this.customer = customer;
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

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }
   
   public String generateReceipt()
   {
       String receipt = "";
       return receipt;
   }
   
   public boolean checkCoupon()
   {
       for (int i = 0 ; i < payment.size() ; i++)
       {
           if (payment.get(i).getPaymentMethod().equals("Coupon"))
                return true;
       }
       return false;
   }
   
   public void addCouponPayment()
   {
       Payment temp = new Payment("Coupon", 5.0);
       payment.add(temp);
   }
   
   public void addPayment(String paymentMethod, double amount)
   {
       Payment temp = new Payment(paymentMethod, amount);
       payment.add(temp);
   }
   
   public String getItemName(int index)
   {
       return items.get(index).getItemName();
   }
   public String getItemDescription(int index)
   {
       return items.get(index).getDescription();
   }
   public double getItemPrice(int index)
   {
       return items.get(index).getPrice();
   }
   public boolean getDeal(int index)
   {
       return items.get(index).getOnDeal();
   }
   public int getItemCount()
   {
       return items.size();
    }
    public int getPaymentCount()
    {
        return payment.size();
    }
    
    public String getPaymentMethod(int index)
    {
        return payment.get(index).getPaymentMethod();
    }
    
    public double getAmount(int index)
    {
        return payment.get(index).getAmount();
    }
}
