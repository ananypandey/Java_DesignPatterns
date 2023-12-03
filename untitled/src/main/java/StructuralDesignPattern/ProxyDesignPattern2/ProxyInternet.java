package StructuralDesignPattern.ProxyDesignPattern2;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet
{
    public static final List<String> bannedSites;
    private final Internet realInternet = new RealInternet();
    static {
        bannedSites= new ArrayList<>();
        bannedSites.add("banned.com");
    }
    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host))
        {
            System.out.println("Access Denied");
            return;
        }
        realInternet.connectTo(host);
    }
}
