package FactoryDesignPattern;

public class Square implements Shape
{
    Square()
    {
        System.out.println("Inside Square");
    }

    @Override
    public void whatShape() {
    System.out.println("Square");
    }
}
