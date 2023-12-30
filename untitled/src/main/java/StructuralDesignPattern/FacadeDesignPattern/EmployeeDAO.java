package StructuralDesignPattern.FacadeDesignPattern;

public class EmployeeDAO
{
    public void insert()
    {
        // Insert into Employee.
    }
    public void updateEmployeeName()
    {
        //Updating Employee Name
    }
    public Employee getEmployeeDetails(String emailId)
    {
        return new Employee();
    }
    public Employee getEmployeeDetails(int empId)
    {
    return new Employee();
    }
}
