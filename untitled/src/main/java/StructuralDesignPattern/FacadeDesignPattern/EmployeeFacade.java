package StructuralDesignPattern.FacadeDesignPattern;
//It has only those methods which employee wanted.

public class EmployeeFacade
{
    EmployeeDAO employeeDAO;
    public EmployeeFacade()
    {
        employeeDAO= new EmployeeDAO();
    }
    public void insert()
    {
        employeeDAO.insert();
    }
    public Employee getEmployeeDetails(int empId)
    {
        return employeeDAO.getEmployeeDetails(empId);
    }
}
