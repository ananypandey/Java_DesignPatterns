package LazySingletonDesignPatter;

public class DBConnection
{
    private static DBConnection dbConnection;
    private DBConnection()
    {
    System.out.println("Got db connection");
    }
    public static DBConnection getInstance()
    {
        if(dbConnection==null)
        {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
