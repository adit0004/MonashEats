
/**
 * 
 */
public class Admin extends User
{
    /**
     * The non-default constructor of Admin class
     */
    public Admin(String newFirstName, String newLastName, String NewphoneNumber,String newEmail,String newPassword, String newAcountType)
    {
        super(newFirstName,newLastName,NewphoneNumber,newEmail,newPassword,newAcountType);
    }

    /**
     * The default constructor of Admin class
     */
    public Admin()
    {
        super();
    }
}
