package java_homework_week3_np;

import java.util.Scanner;

public class Prog16FindNo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            if (number > 0) {
                System.out.println("POSITIVE");
            } else if (number < 0) {
                System.out.println("NEGATIVE");
            } else {
                System.out.println("ZERO");
            }

            input.close();
        }
    }

