package AbstractFactoryDesignPattern;

public class Mains
{
    public static void main(String[] args){
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("Luxury");
        Car car = abstractFactory.getInstance(2000000);
        System.out.println(car.getTopSpeed());
    }
}
