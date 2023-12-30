package StructuralDesignPattern.AdapterDesignPattern;

interface Bird
{
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird
{

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
    System.out.println("Chirp Chirp");
    }
}
interface ToyDuck
{
    public void squeak();
}
class PlasticToyDuck implements ToyDuck
{

    @Override
    public void squeak() {
        System.out.println("Squeak Squeak");
    }
}
class BirdAdapter implements ToyDuck
{
    Bird bird;
    public BirdAdapter(Bird bird)
    {
        this.bird=bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        toyDuck.squeak();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();
        System.out.println("Inside Main");
    }
}
//Suppose we have bird that can makeSound(), and we have a plastic toy duck that can squeak(). Now suppose our clients changes the requirement and he wants the toyduck to makeSound.
// Simple solution is that we will just change the implementation class to the new adapter class and tell the client to pass the instance of the bird(Which wants to squeak) to that class.
//The adapter pattern which we have implemented is called Object adapter pattern.

//Advantage :
// Helps achieve reusability  and fexibility.
// Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementation of adapters.

//Disadvantage :
//  All requests are forwarded, so there is slight increase in the overhead
//  Sometimes many adaptations are required along an adapter chain to reach the type which is required.