/**
 * A class that represents an email notification system.
 * Implements the NotificationMedium interface.
 * @author Seol Hong
 * @version 1.0.0
 */
public class EmailService implements NotificationMedium {
    /**
     * Method to send an email notification.
     * @param message The message to be sent
     */
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}
