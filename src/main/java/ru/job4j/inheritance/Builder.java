package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String specialization;

    public Builder(String name, String surname, String education,
                   String birthday, String grade, String specialization) {
        super(name, surname, education, birthday, grade);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
