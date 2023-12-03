package FactoryDesignPattern;

//It is used when all the object creation and it's business logic we need to keep at one place
public class Mains
{
    public static void main(String[] args){
        ShapeInstanceFactory shape = new ShapeInstanceFactory();
        shape.getShapeInstance("CIRCLE");
    }
}
