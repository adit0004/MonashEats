/**
 * Class for owner user
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */

public class Owner extends User
{
    /**
     * Default constructor should create a default administrator
     */
    
    public Owner()
    {
        super("Administrator", "", "", "admin1@monash.edu", "admin");
    }
    
    /**
     * Non-default constructor
     */
    public Owner(String newFirstName, String newLastName, String newPhoneNumber, String newEmailAddress, String newPassword)
    {
        super(newFirstName, newLastName, newPhoneNumber, newEmailAddress, newPassword);
    }
}