package SOLID.OCP;

public class EmailNotificationService implements Notification
{

    @Override
    public void sendOTP(String medium) {
        // Logic to send email to the client
    }

    @Override
    public void sendTransactionReport(String medium) {

    }

}
