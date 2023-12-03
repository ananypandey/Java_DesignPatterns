package FactoryDesignPattern;

public class ShapeInstanceFactory
{
    public Shape getShapeInstance(String value)
    {
        if (value.toLowerCase().equals("circle"))
        {
            return new Circle();
        }
        else if(value.toLowerCase().equals("rectangle"))
        {
            return new Rectangle();
        }
        else if (value.toLowerCase().equals("square"))
        {
            return new Square();
        }
        return null;
    }
}
