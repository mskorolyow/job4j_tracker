package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] product = new Product[5];
        product[0] = new Product("Milk", 10);
        product[1] = new Product("Bread", 4);
        product[2] = new Product("Egg", 19);
        for (Product prod : product) {
            if (prod != null) {
                System.out.println(prod.getName());
            }
        }
    }

    public static int indexOfNull(Product[] products) {
        int result = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                result = i;
                break;
            }
        }
        return result;
    }
}
