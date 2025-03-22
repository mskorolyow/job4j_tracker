package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private final String programLanguage;

    public Programmer(int experience, boolean degree, String programLanguage) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}
