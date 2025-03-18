package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error(false, 11, "False 11");
        error2.printInfo();
        Error error3 = new Error(true, 88, "True 88");
        error3.printInfo();
    }

    public void printInfo() {
        System.out.println("Error condition is: " + active);
        System.out.println("Error status is: " + status);
        System.out.println("Message is: " + message);
    }
}
