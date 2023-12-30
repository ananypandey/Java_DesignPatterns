package BehavioralDesignPatterns.Command;

public class Main
{
    public static void main(String[] args)
    {
    System.out.println("Inside Main");
    // Why we Command Design pattern
    // Lack Of Abstraction :
    // Today, process of turning on AC is simple, but if there are more steps, client has to aware all of that, which is not good.

    //Undo/Redo Functionality:
    // What if I want to implement the undo/redo capability. How it will be handled.

    //Difficulty in code Maintenance:
    //  What if in future, we have to support more commands for more devices example Bulb
        // So if there are 100 devices than client has to know about all the 100 devices.

        // So in command design pattern client will invoke a command for the receiver(Place where the operation is to be performed).

    }
}
