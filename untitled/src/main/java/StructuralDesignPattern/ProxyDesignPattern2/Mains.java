package StructuralDesignPattern.ProxyDesignPattern2;

public class Mains
{
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        internet.connectTo("banned.com");
    }

}
