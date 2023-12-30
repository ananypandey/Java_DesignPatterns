package StructuralDesignPattern.ClassAdapter;

interface Target
{
    void request();
}
class Adaptee
{
    void specificRequest()
    {
        System.out.println("Adptee's specific functionality");
    }
}
class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}
public class Client
{
    public static void main(String[] args){
        Target classAdapter = new ClassAdapter();
        classAdapter.request();
    }
}
// Uses inheritance to adapt the Adaptee to the target interface.
// May be less flexible because it binds the Adapter to a specific Adaptee class.
// Can adapte only one adaptee class due to Java's single inheritance.