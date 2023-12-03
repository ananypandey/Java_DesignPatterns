package StructuralDesignPattern.ProxyDesignPattern;

public class ProxyDesignPattern
{
    public static void main(String[] args){
        try{
            EmployeeDao obj = new EmployeeDaoProxy();
            obj.create("USER",new EmployeeDo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
