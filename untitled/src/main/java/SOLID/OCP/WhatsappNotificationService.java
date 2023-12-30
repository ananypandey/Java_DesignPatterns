package SOLID.OCP;

public class WhatsappNotificationService implements Notification
{

    @Override
    public void sendOTP(String medium) {
        //Logic to send whatsapp api
    }

    @Override
    public void sendTransactionReport(String medium) {

    }
}
