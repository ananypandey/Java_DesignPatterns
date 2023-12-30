package Builder;

public class Mains
{
    public static void main(String[] args){
        EngineeringStudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();

        Student student = new StudentBuilder().setMotherName("Sandhya").build();
    System.out.println(student.toString());
    }
    //When you want to create object step by step;
    //If in case we only want to have roll number as necessary and all other things optional. So we end up creating many constructor.
    //But there is a problem with this and it is code duplicate.
}
