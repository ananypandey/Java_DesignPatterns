package LazySingletonDesignPatter;

public class Main
{
    //But there is a problem with lazy what if teo at same instance and call getinsatnce for db connection.
    //This will create 2 object of the db connection will be create.
    public static void main(String[] args){
        DBConnection connection = DBConnection.getInstance();
        DBConnection dbConnection = DBConnection.getInstance();
    }
}
