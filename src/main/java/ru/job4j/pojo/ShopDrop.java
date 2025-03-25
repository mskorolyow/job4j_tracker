package ru.job4j.pojo;

public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
        products[1] = null;
        for (Product prod : products) {
            if (prod != null) {
                System.out.println(prod.getName());
            } else {
                System.out.println("null");
            }
        }

        products[1] = products[2];
        products[2] = null;
        System.out.println("Переставили вручную значения ячеек: ");
        for (Product prod : products) {
            if (prod != null) {
                System.out.println(prod.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {

        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
