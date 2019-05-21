
/**
 * 
 */
public class Customer extends User
{
    private boolean isStudent;
    private String address;
    private boolean within30KM;
    
    /**
     * Customer class default constructor
     */
    public Customer()
    {
        super();
        isStudent = false;
        address = "";
        within30KM = false;
    }

    /**
     * Customer class non-default constructor
     */
    public Customer(String newFirstName, String newLastName, String NewphoneNumber,String newEmail,
                String newPassword, String newAcountType, String newAddress, boolean newIsStudent, boolean newWithin30KM)
    {
        super(newFirstName,newLastName,NewphoneNumber,newEmail, newPassword, newAcountType);
        isStudent = newIsStudent;
        address = newAddress;
        within30KM = newWithin30KM;
    }
    
    /**
     * display customer details - address and the customer is student(true) or not(false)
    */
    public void displayDetails()
    {
        super.display();
        System.out.println("Address: " + address);
        System.out.println("isStudent: " + isStudent);
    }
    
    /**
     * get the account is student(true) or not(false)
     * return a boolean
    */
    public boolean getIsStudent()
    {
        return isStudent;
    }
    
    /**
     * get the account owner's address
     * return a String
    */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * get the account owner within 30 KM or not
     */
    public boolean getWithin30KM()
    {
        return within30KM;
    }
    
    /**
     * set the account owner's first name
     */
    public void setIsStudent(boolean newIsStudent)
    {
        isStudent = newIsStudent;
    }
    
    /**
     * set the account owner's address
     */
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    /**
     * set the account owner within 30 KM or not
     */
    public void setWithin30KM(boolean newWithin30KM)
    {
        within30KM = newWithin30KM;
    }
}
