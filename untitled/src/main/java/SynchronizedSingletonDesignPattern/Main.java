package SynchronizedSingletonDesignPattern;

//Synchronized DB connection is a expensive operation
//Every time a thread comes then you need to lock from not allowing the other thread to access.
public class Main
{
    public static void main(String[] args)
    {
        DBConnection connection = DBConnection.getInstance();
    }
}
