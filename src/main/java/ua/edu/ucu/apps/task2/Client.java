package ua.edu.ucu.apps.task2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString @Getter @NoArgsConstructor
public class Client {
    private static int counter = 0;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private String gender;
    private String email;

    public Client(String name, LocalDate dob, String gender, String email) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }
}
