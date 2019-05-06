/**
 * Class for admin user
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */

public class Admin extends User
{
    /**
     * Default constructor should create a default administrator
     */
    
    public Admin()
    {
        super("Administrator", "", "", "admin1@monash.edu", "admin");
    }
    
    /**
     * Non-default constructor
     */
    public Admin(String newFirstName, String newLastName, String newPhoneNumber, String newEmailAddress, String newPassword)
    {
        super(newFirstName, newLastName, newPhoneNumber, newEmailAddress, newPassword);
    }
}