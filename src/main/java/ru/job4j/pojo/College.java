package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Курочкин Евгений Борисович");
        student.setGroup("it-xx-2025");
        student.setEnrolled(new Date());
        System.out.println(student.getFullName() + " поступил в группу: " + student.getGroup() + " - зачислен: " + student.getEnrolled());
    }
}
