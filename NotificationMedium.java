/**
 * Interface to represent a notification system that can send messages.
 * @author Seol Hong
 * @version 1.0.0
 */
public interface NotificationMedium {
    /**
     * Method to send a notification.
     * @param message The message to be sent
     */
    void send(String message);
}

