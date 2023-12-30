package CarParking.model;

public class Car
{
    private String registartionNumber;
    private String color;

    public String getRegistrationNumber()
    {
        return registartionNumber;
    }
    public String getColor()
    {
        return color;
    }
    public Car(final String registartionNumber,final String color)
    {
        this.registartionNumber=registartionNumber;
        this.color=color;
    }
}
