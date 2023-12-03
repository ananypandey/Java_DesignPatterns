package SingletonDesignPattern;

// Eager Initialization
// It is used when we have to create only one 1 instance of the class
public class DBConnection
{
    private static DBConnection conObject = new DBConnection();
    private DBConnection()
    {
    System.out.println("Got Connection ");
    }
    public static DBConnection getConnection()
    {
        return conObject;
    }
}
