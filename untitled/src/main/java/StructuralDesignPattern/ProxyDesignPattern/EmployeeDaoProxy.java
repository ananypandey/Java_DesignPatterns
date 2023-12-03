package StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    EmployeeDaoProxy()
    {
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN"))
        {
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {

        if (client.equals("ADMIN"))
        {
            employeeDao.delete(client,empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USERS"))
        {
            return employeeDao.get(client,empId);
        }
        throw new Exception("Access Denied");
    }
}
