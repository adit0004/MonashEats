/**
 * Class for customer user
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */

public class Customer extends User
{
    String address;
    boolean isStudent;
    /**
     * Default constructor should create a default administrator
     */
    
    public Customer()
    {
        super();
        address = "";
        isStudent = false;
    }
    
    /**
     * Non-default constructor
     */
    public Customer(String newFirstName, String newLastName, String newPhoneNumber, String newEmailAddress, String newPassword, String newAddress, boolean newIsStudent)
    {
        super(newFirstName, newLastName, newPhoneNumber, newEmailAddress, newPassword);
        address = newAddress;
        isStudent = newIsStudent;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public boolean getIsStudent()
    {
        return isStudent;
    }
    
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    public void setIsStudent(boolean newIsStudent)
    {
        isStudent = newIsStudent;
    }
}