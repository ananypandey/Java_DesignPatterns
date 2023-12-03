package PrototypeDesignPattern;

public class Student implements Prototype
{
    String name;
    int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void getRollNumber()
    {
        System.out.println(this.rollNumber);
    }
    @Override
    public Prototype clone() {
        return new Student(this.name,this.age,this.rollNumber);
    }
}
