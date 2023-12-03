package FactoryDesignPattern;

public class Circle implements Shape
{
    Circle()
    {
        System.out.println("Inside Circle");
    }

    @Override
    public void whatShape()
    {
        System.out.println("Circle");
    }
}
