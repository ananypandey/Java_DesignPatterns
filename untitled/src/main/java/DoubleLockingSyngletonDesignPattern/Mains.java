package DoubleLockingSyngletonDesignPattern;

public class Mains
{
    public static void main(String[] args){
        DBConnection dbConnection= DBConnection.getInstance();
    }
}
