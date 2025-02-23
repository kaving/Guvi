package com.employee;

public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 12345, 50000);
        emp.displayEmployeeDetails();
    }
}
