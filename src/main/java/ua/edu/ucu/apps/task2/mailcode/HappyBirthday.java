package ua.edu.ucu.apps.task2.mailcode;

import ua.edu.ucu.apps.task2.Client;

public class HappyBirthday implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday!", client.getName());
    }
}
