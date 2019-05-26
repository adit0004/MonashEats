public class User
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String accountType;


    
    /**
     * the non-default constructor of the User class
     */
    public User(String newFirstName, String newLastName, String NewphoneNumber,String newEmail,String newPassword, String newAcountType)
    {
        firstName = newFirstName;
        lastName = newLastName;
        phoneNumber = NewphoneNumber;
        email = newEmail;
        password = newPassword;
        accountType = newAcountType;
    }

    /**
     * the default constructor of the User class
     */
    public User()
    {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        email = "";
        password = "";
        accountType = "";
    }
    /**
     * display the user's details
     */
    public void display()
    {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email Address: " + email);
        System.out.println("Password: " + password);
        System.out.println("Account type: " + accountType);
    }
    
    /**
     * get the account owner's first name
     * return a String
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * get the account owner's Last name
     * return a String
    */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * get the account owner's phone number
     * return a String
    */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * get the account owner's email address
     * return a String
    */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * get the account owner's password
     * return a String
    */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * get the account type
     * return a String
    */
    public String getAccountType()
    {
        return accountType;
    }
    
    /**
     * set the account owner's first name
     */
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    
    /**
     * set the account owner's Last name
    */
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    
    /**
     * set the account owner's phone number
    */
    public void setPhoneNumber(String NewphoneNumber)
    {
        phoneNumber = NewphoneNumber;
    }
    
    /**
     * set the account owner's email address
    */
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    /**
     * set the account owner's password
    */
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }
    
    /**
     * set the account type
    */
    public void setAccountType(String newAccountType)
    {
        accountType = newAccountType;
    }
    public String getAddress()
    {
        return "";
    }
}
