package DoubleLockingSyngletonDesignPattern;

public class DBConnection
{
    public static DBConnection connectionObject;
    private DBConnection()
    {
    }
    public static DBConnection getInstance()
    {
        if(connectionObject==null)
        {
            synchronized (DBConnection.class)
            {
                if(connectionObject==null)
                {
                    connectionObject=new DBConnection();
                }
            }
        }
        return connectionObject;
    }
}
