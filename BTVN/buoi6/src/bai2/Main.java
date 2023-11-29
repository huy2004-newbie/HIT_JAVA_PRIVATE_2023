package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();
    public static void add(ArrayList<Employee> employees) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            choice = 0;
            while (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("1. Input PartTimeEmployee.");
                System.out.println("2. Input FullTimeEmployee");
                System.out.println("3. Finish");
                System.out.print("Input choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            }

            switch (choice) {
                case 1:
                    System.out.print("Input name: ");
                    String name_p = sc.nextLine();
                    System.out.print("Input PaymentPerHour: ");
                    int paymentPerHour_p = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Input WorkingHours: ");
                    int workingHours_p = sc.nextInt();
                    sc.nextLine();

                    PartTimeEmployee pt = new PartTimeEmployee(name_p, paymentPerHour_p, workingHours_p);
                    employees.add(pt); // Add the created PartTimeEmployee to the list
                    break;
                case 2:
                    System.out.print("Input name: ");
                    String name_f = sc.nextLine();
                    System.out.print("Input PaymentPerHour: ");
                    int paymentPerHour_f = sc.nextInt();
                    sc.nextLine();

                    FullTimeEmployee ft = new FullTimeEmployee(name_f, paymentPerHour_f);
                    employees.add(ft); // Add the created FullTimeEmployee to the list
                    break;
                case 3:
                    System.out.println("FINISH");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }

            // Reset choice for the next iteration

        } while (choice != 3);
    }

    public static void display(ArrayList<Employee> employees){
        System.out.printf("%-30s%-20s%-20s\n","Name", "PaymentPerHour", "WorkingHours");
        for(Employee employee : employees){
            System.out.printf("%-30s%-20d%-20d", employee.getName(), employee.getPaymentPerHour(), employee.getWorkingHours());
            System.out.println();
        }
    }

    public static void sortEmployeeBySalary(ArrayList<Employee> employees){
        Collections.sort(employees, Comparator.comparingDouble(IEmployee::calculateSalary).reversed());
    }

    public static void findEmployeeWithMostHours(ArrayList<Employee> employees){
        Employee maxWorkingHours = Collections.max(employees, (e1, e2) -> Integer.compare(e1.getWorkingHours(), e2.getWorkingHours()));
        System.out.println("Employee With Most Hours: " + maxWorkingHours.getName());
    }

    public static void removeEmployeeWithLeastHours(ArrayList<Employee> employees){
        Employee minWorkingHours = Collections.min(employees, (e1, e2) -> Integer.compare(e1.getWorkingHours(), e2.getWorkingHours()));
        System.out.println("Remove Employee With Least Hours Finish");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Show");
            System.out.println("3. Sort by salry");
            System.out.println("4. Find Employee With Most Hours");
            System.out.println("5. Remove Employee With Least Hours");
            System.out.println("0. Exit");
            System.out.print("Input choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add(employees);
                    break;

                case 2:
                    display(employees);
                    break;

                case 3:
                    sortEmployeeBySalary(employees);
                    System.out.println("Done");
                    break;

                case 4:
                    findEmployeeWithMostHours(employees);
                    break;

                case 5:
                    removeEmployeeWithLeastHours(employees);
                    break;
            }
        } while (choice != 0);

    }

}
