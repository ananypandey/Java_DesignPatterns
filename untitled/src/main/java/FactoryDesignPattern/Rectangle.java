package FactoryDesignPattern;

public class Rectangle implements Shape
{
    Rectangle()
    {
        System.out.println("Inside Rectangle");
    }

    @Override
    public void whatShape() {
    System.out.println("Rectangle");
    }
}
