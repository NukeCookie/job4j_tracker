package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education,
                      String birthday, String grade, String language) {
        super(name, surname, education, birthday, grade);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
