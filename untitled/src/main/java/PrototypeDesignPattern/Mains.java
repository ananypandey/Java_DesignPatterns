package PrototypeDesignPattern;

public class Mains
{
    public static void main(String[] args){
        Student student = new Student("Anay",23,1);
        Student student1 =(Student) student.clone();
        student1.getRollNumber();

        //Prototype Design Pattern is used to make copy/clone from existing object;
        // We could have copied student1.name = student.name but what if the field are private like roll Number;
        // We need to make prototype for it.
    }
}
