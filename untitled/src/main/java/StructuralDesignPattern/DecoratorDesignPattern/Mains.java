package StructuralDesignPattern.DecoratorDesignPattern;

public class Mains
{
    public static void main(String[] args)
    {
        System.out.println("Inside Main");
        BasePizza basePizza = new ExtraCheese(new Margherita());
        System.out.println(basePizza.cost());
    }
}
