package SOLID.OCP;

public class MobileNotificationService implements Notification
{

    @Override
    public void sendOTP(String medium) {
        // Logic to send message to mobile
    }

    @Override
    public void sendTransactionReport(String medium) {

    }
}
