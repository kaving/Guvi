package com.product;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Product[] products = new Product[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter product " + (i + 1) + " price:");
                int price = scanner.nextInt();
                System.out.println("Enter product " + (i + 1) + " quantity:");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume the newline
                products[i] = new Product(i+1, price, quantity);
            }

            System.out.println("Total amount spent on all products: " + new ProductMain().totalAmountSpentOnAllProducts(products));
        }
    }

    private int totalAmountSpentOnAllProducts(Product[] products) {
        int totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

}
