package ua.edu.ucu.apps.task2;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailSender {

    private final String username;
    private final String password;

    public MailSender(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void sendMail(MailInfo mailInfo) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
    
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
    
            // Use client's email address as the recipient
            // Ensure Client class has a valid email field
            String recipientEmail = mailInfo.getClient().getEmail();  // Update to include a valid email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
    
            message.setSubject("Notification");
            message.setText(mailInfo.generate());
    
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
