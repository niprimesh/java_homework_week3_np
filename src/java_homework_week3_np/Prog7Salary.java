package java_homework_week3_np;

import java.util.Scanner;

public class Prog7Salary {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Sales ID: ");
            int salesId = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Enter Seller's Name: ");
            String sellerName = input.nextLine();

            System.out.print("Enter Sales Amount: £");
            double salesAmount = input.nextDouble();

            System.out.print("Enter Basic Salary: £");
            double basicSalary = input.nextDouble();

            // Calculate Sales Commission based on the provided criteria
            double salesCommission = 0.0;
            if (salesAmount >= 50000) {
                salesCommission = 0.35 * salesAmount;
            } else if (salesAmount >= 30000) {
                salesCommission = 0.20 * salesAmount;
            } else if (salesAmount >= 20000) {
                salesCommission = 0.10 * salesAmount;
            } else if (salesAmount >= 10000) {
                salesCommission = 0.05 * salesAmount;
            } else {
                salesCommission = 0.02 * salesAmount;
            }

            // Print the result
            System.out.println("Sales ID: " + salesId);
            System.out.println("Seller's Name: " + sellerName);
            System.out.println("Sales Amount: £" + salesAmount);
            System.out.println("Basic Salary: £" + basicSalary);
            System.out.println("Sales Commission: £" + salesCommission);

            input.close(); // Close the scanner
        }
    }

