package com.employeedetails;

import java.util.Scanner;

public class EmployeeDetailsMain {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

      try {
          System.out.println("Enter Employee ID: ");
          int id = scanner.nextInt();

          scanner.nextLine(); // Consume leftover newline

          System.out.println("Enter Employee Name: ");
          String name = scanner.nextLine();

          System.out.println("Enter Employee Salary: ");
          double salary = scanner.nextDouble();

          System.out.println("Is this employee a Manager? (yes/no): ");
          scanner.nextLine(); // Consume leftover newline
          String isManager = scanner.nextLine();

          Employee employee;

          if (isManager.equalsIgnoreCase("yes")) {
              System.out.println("Enter Manager Bonus: ");
              double bonus = scanner.nextDouble();
              employee = new Manager(id, name, salary, bonus);
          } else {
              employee = new Employee(id, name, salary);
          }

          System.out.println("\nEmployee Details:");
          employee.displayDetails();

      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      } catch (Exception e) {
          System.out.println("Error: Invalid input.");
      } finally {
          scanner.close();
      }
  }
}
