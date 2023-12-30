package SOLID.OCP;

public interface Notification
{
    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);
}
