package SynchronizedSingletonDesignPattern;

public class DBConnection
{
    private static DBConnection conObject;
    private DBConnection()
    {
        System.out.println("Inside DBConnection");
    }
    synchronized public static DBConnection getInstance()
    {
        if(conObject==null)
        {
            conObject = new DBConnection();
        }
        return conObject;
    }
}
