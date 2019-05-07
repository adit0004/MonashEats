
/**
 * 
 */
public class Owner extends User
{    
    /**
     * the non-default constructor of the Owner class
     */
    public Owner(String newFirstName, String newLastName, String NewphoneNumber,String newEmail,String newPassword, String newAcountType)
    {
        super(newFirstName, newLastName, NewphoneNumber, newEmail, newPassword, newAcountType);
    }

    /**
     * the default constructor of the Owner class
     */
    public Owner()
    {
        super();
    }
}
