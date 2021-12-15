package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String prosthesis;

    public Dentist(String name, String surname, String education,
                   String birthday, String grade, String prosthesis) {
        super(name, surname, education, birthday, grade);
        this.prosthesis = prosthesis;
    }

    public String getProsthesis() {
        return prosthesis;
    }
}
