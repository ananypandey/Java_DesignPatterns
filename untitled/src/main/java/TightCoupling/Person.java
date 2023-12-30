package TightCoupling;

public class Person
{
    //Tight coupling refers to a situation where two or more components or classes are highly dependent on each other.
    // Changes in one component may directly affect the other, making the system less flexible and harder to maintain.
    public static void main(String[] args){
        Travel bus = new Travel();
        bus.start();

    }
    //So here Travel is tightly coupled with Person.
    //Similarly, Travel bus and train are tightly coupled.

}
