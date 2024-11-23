package ua.edu.ucu.apps.task2;

import java.time.LocalDate;
import ua.edu.ucu.apps.task2.mailcode.HappyBirthday;
import ua.edu.ucu.apps.task2.mailcode.PromotionalOffer;

public class Main {
    public static void main(String[] args) {
        // Create clients
        Client client1 = new Client("Oles", LocalDate.of(2006, 1, 16), "male", "oles@example.com");
        Client client2 = new Client("Anna", LocalDate.of(1998, 5, 20), "female", "anna@example.com");

        // Create mail codes
        MailInfo birthdayMail = new MailInfo(client1, new HappyBirthday());
        MailInfo promoMail = new MailInfo(client2, new PromotionalOffer());

        // Add to mailbox
        MailBox mailbox = new MailBox();
        mailbox.addMailInfo(birthdayMail);
        mailbox.addMailInfo(promoMail);

        // Configure and send emails
        MailSender sender = new MailSender("margaritasomali@gmail.com", "fnpv ahwp lmcr rvlz");
        mailbox.sendAll(sender);
    }
}
