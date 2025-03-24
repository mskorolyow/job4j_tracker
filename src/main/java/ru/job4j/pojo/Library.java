package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Книга1", 120);
        Book book2 = new Book("Книга2", 220);
        Book book3 = new Book("Clean code", 320);
        Book book4 = new Book("Книга4", 420);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book book : books) {
            System.out.println(book.getName() + ": количество страниц " + book.getPage());
        }
        Book temp = new Book("", 0);
        temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        System.out.println("Вывод массива после перестановки элементов [0] : [3]");
        for (Book book : books) {
            System.out.println(book.getName() + ": количество страниц " + book.getPage());
        }
        System.out.println("Здесь вывод только по условию: \n");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + ": количество страниц " + book.getPage());
            }
        }
    }
}
