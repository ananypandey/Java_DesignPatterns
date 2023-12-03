package StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
    System.out.println("Create new row in the Employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
    System.out.println("Deleted row with employee ID : "+empId);
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
    System.out.println("Fetching data from the DB");
    return new EmployeeDo();
    }
}
