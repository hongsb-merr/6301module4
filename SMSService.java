/**
 * A class that represents an SMS notification system.
 * Implements the NotificationMedium interface.
 * @author Seol Hong
 * @version 1.0.0
 */
public class SMSService implements NotificationMedium {
    /**
     * Method to send an SMS notification.
     * @param message The message to be sent
     */
    public void send(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

