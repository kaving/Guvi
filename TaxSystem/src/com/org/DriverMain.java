package com.org;

public class DriverMain {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine(); // consume newline1
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        System.out.println("Income Tax for Employee: " + employee.calcTax());

        System.out.println("Enter Product ID:");
        int pid = scanner.nextInt();
        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        System.out.println("Sales Tax for Product: " + product.calcTax());

        scanner.close();
    }
}
