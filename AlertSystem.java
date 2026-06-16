import java.util.ArrayList;

/**
 * A class that manages delegating notifications through a specific alert system.
 * Utilizes composition to allow changing notification systems at runtime.
 * Keeps a log of all messages that were sent.
 * @author Seol Hong
 * @version 1.0.0
 */
public class AlertSystem {
    private NotificationMedium medium;
    private ArrayList<String> log;
    /**
     * Constructs an AlertSystem object with the initial NotificationMedium system.
     * @param medium The notification medium to use
     */
    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.log = new ArrayList<>();
    }
    /**
     * Changes the notification medium.
     * @param medium The notification medium to switch into
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }
    /**
     * Sends a notification message using the current notification medium.
     * Adds the message to the log.
     * @param message The message to be sent
     */
    public void notifyUser(String message) {
        medium.send(message);
        log.add(message);
    }
    /**
     * Displays all messages sent during the session.
     */
    public void displayLog() {
        System.out.println("\nNotification Log:");
        for (String message : log) {
            System.out.println(message);
        }
    }
}
