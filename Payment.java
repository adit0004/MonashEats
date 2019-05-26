/**
 * The class to handle payments
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */
public class Payment
{
    String paymentMethod;
    double amount;
    
    public Payment()
    {
        paymentMethod = "";
        amount = 0.0;
    }
    
    public Payment(String method, double amount)
    {
        paymentMethod = method;
        this.amount = amount;
    }
    
    public void setPaymentMethod(String paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    public String getPaymentMethod()
    {
        return paymentMethod;
    }
    
    public double getAmount()
    {
        return amount;
    }


}
