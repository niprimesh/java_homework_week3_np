package java_homework_week3_np;
/**
 * salary slip java programme
 */

import java.util.Scanner;

public class Prog5Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        // Calculate HRA, TA, DA, PF
        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;

        // Calculate Gross Salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Print the result in the desired format
        System.out.println("__________________________________________");
        System.out.println("|   Employee ID: " + employeeId + "                     |");
        System.out.println("|________________________________________|");
        System.out.println("|   Employee Name:  "+ employeeName+"                 |");
        System.out.println("|   Basic Salary:   "+ basicSalary+   "              |");
        System.out.println("|________________________________________|");
        System.out.println("|   HRA-10%: " + hra+"                      |");
        System.out.println("|   TA-8%: " + ta+ "                       |");
        System.out.println("|   DA-9%: " + da+"                       |");
        System.out.println("|   PF-20%: " + pf+"                      |");
        System.out.println("|________________________________________|");
        System.out.println("|Gross Salary: " + grossSalary+"          |");
        System.out.println("|_______________________________________|");

        input.close(); // Close the scanner
    }
}