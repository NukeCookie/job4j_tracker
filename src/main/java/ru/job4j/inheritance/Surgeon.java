package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean operationType;

    public Surgeon(String name, String surname, String education,
                   String birthday, String grade, boolean operationType) {
        super(name, surname, education, birthday, grade);
        this.operationType = operationType;
    }

    public boolean getOperationType() {
        return operationType;
    }
}
