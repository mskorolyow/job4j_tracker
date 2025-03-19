package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true,4000,"Intel Core I7-10700K");
        computer.printInfo();
        Computer comp = new Computer(true,1000,"AMD Ryzen 5 3600");
        comp.printInfo();
        Computer comp1 = new Computer();
        comp1.printInfo();
        Computer comp2 = new Computer(1500, "AMD Ryzen 9");
        comp2.printInfo();
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + "GB");
        System.out.println("Модель CPU: " + cpu);
    }
}
