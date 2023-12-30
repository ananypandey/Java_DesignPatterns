package StructuralDesignPattern.FacadeDesignPattern;

// Facade is used when we want to hide the system complexity from the client.
//Example : A car has brake and accelerator. He knows accelerator will increase the speed while brake will decrease the speed but he is unaware about the implementation of the accelerator
// and brake.

// Facade is a optional design pattern, It is upto the client to use Facade or not.
public class Employee
{
    public static void main(String[] args){
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employeeDetails = employeeFacade.getEmployeeDetails(123);
    }
}
