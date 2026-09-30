package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Заявка тестовая 01");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDataTimeFormat = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время: " + currentDataTimeFormat);
        Tracker tracker = new Tracker();
        tracker.add(item);
        String trackerResult = tracker.findById(1).getName();
        System.out.println(trackerResult);
        System.out.println(tracker.findById(1).getCreated());
        System.out.println("-------");
        System.out.println(item);

    }
}
