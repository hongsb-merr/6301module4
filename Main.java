/**
 * The main class and method to showcase the usage of the other classes.
 * A prototype of the code was provided to ChatGPT, and the output had minimal changes to functionality.
 * The output included the implementation of the displayLog method in the AlertSystem class.
 * @author Seol Hong
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        AlertSystem alert = new AlertSystem(new EmailService());
        alert.notifyUser("Your order has shipped.");
        alert.setMedium(new SMSService());
        alert.notifyUser("Your package will arrive today.");
        alert.displayLog();
    }
}