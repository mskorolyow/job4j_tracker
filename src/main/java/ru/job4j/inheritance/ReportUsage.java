package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report`s name", "Report`s body");
        System.out.println(text);
        HtmlReport report1 = new HtmlReport();
        String text1 = report1.generate("Report`s1 name", "Report`s1 body");
        System.out.println("Это отчет из дочернего класса: \n"  + text1);
    }
}


