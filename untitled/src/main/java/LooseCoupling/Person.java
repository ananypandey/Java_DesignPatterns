package LooseCoupling;

public class Person
{
    public static void main(String[] args){
        Transport transport = new Bus();
        Travel travel = new Travel(transport);
        travel.start();
    }
}
