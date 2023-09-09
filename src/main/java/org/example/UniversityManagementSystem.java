package org.example;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String[] coursesEnrolled;
    private String studentID;

    public Student(String firstName, String lastName, int age, String[] coursesEnrolled, String studentID) {
        super(firstName, lastName, age);
        this.coursesEnrolled = coursesEnrolled;
        this.studentID = studentID;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentID);
        System.out.print("Courses Enrolled: ");
        for (String course : coursesEnrolled) {
            System.out.print(course + ", ");
        }
        System.out.println();
    }
}

class Employee extends Person {
    private double salary;
    private String departmentName;
    private String designation;
    private String employeeID;

    public Employee(String firstName, String lastName, int age, double salary, String departmentName, String designation, String employeeID) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.departmentName = departmentName;
        this.designation = designation;
        this.employeeID = employeeID;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + departmentName);
        System.out.println("Designation: " + designation);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for Student, 2 for Employee, 0 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 0) {
                break;
            }

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String studentID = scanner.nextLine();
                System.out.print("Enter Courses Enrolled (comma-separated): ");
                String[] coursesEnrolled = scanner.nextLine().split(",");
                Student student = new Student(firstName, lastName, age, coursesEnrolled, studentID);
                student.displayDetails();
            } else if (choice == 2) {
                System.out.print("Enter Employee ID: ");
                String employeeID = scanner.nextLine();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Department Name: ");
                String departmentName = scanner.nextLine();
                System.out.print("Enter Designation: ");
                String designation = scanner.nextLine();
                Employee employee = new Employee(firstName, lastName, age, salary, departmentName, designation, employeeID);
                employee.displayDetails();
            }
        }

        scanner.close();
    }
}
