package Builder;

import java.util.List;

public class StudentBuilder
{
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAge(int age)
    {
        this.age = age;
        return this;
    }
    public StudentBuilder setName(String name)
    {
        this.name = name;
        return this;
    }
    public StudentBuilder setFatherName(String name)
    {
        this.fatherName= name;
        return this;
    }
    public StudentBuilder setMotherName(String name)
    {
        this.motherName= name;
        return this;
    }
//    abstract public StudentBuilder setSubjects();
    public Student build()
    {
        return new Student(this);
    }
}
