package ua.edu.ucu.apps.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(MailSender sender) {
        for (MailInfo info : infos) {
            sender.sendMail(info);
        }
    }
}

