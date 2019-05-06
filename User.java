/**
 * Parent class for users
 *
 * @author Aditya Kumar
 * @version 5/5/2019
 */

public class User
{
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String password;
    
    /**
     * Default constructor for user
     */
    public User()
    {
        firstName = "Default";
        lastName = "User";
        phoneNumber = "";
        email = "";
        password = "";
    }
    
    /**
     * Parameterized constructor
     */
    public User(String newFirstName, String newLastName, String newPhoneNumber, String newEmail, String newPassword)
    {
        firstName = newFirstName;
        lastName = newLastName;
        phoneNumber = newPhoneNumber;
        email = newEmail;
        password = newPassword;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    
    public void setPhoneNumber(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
}