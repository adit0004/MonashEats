
/**
 * 
 */
public class Customer extends User
{
    private boolean isStudent;
    private String address;
    
    /**
     * Customer class default constructor
     */
    public Customer()
    {
        super();
        isStudent = false;
        address = "";
    }

    /**
     * Customer class non-default constructor
     */
    public Customer(String newFirstName, String newLastName, String NewphoneNumber,String newEmail,
                String newPassword, String newAcountType, boolean newIsStudent, String newAddress)
    {
        super(newFirstName,newLastName,NewphoneNumber,newEmail,newPassword,newAcountType);
        isStudent = newIsStudent;
        address = newAddress;
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
}
