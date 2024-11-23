package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.task2.mailcode.MailCode;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client); 
    }

    public Client getClient() {
        return this.client;
    }
}
