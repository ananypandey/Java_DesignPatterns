package SingletonDesignPattern;

public class Main
{
    public static void main(String[] args){
        DBConnection connection = DBConnection.getConnection();
        DBConnection connection1 = DBConnection.getConnection();
    }
}
