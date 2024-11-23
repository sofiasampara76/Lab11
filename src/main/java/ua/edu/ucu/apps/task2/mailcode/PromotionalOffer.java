package ua.edu.ucu.apps.task2.mailcode;

import ua.edu.ucu.apps.task2.Client;

public class PromotionalOffer implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Don't miss our latest offers!", client.getName());
    }
}
