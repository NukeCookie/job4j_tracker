package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSnp("Митяева Анна Витальевна");
        student.setGroup("стажёр");
        student.setDate("23.07.2021");
        System.out.println("ФИО: " + student.getSnp() + ", группа: "
                + student.getGroup() + ", дата поступления: " + student.getDate() + ".");
    }
}
