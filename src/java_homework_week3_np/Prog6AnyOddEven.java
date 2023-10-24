package java_homework_week3_np;
/**
 * odd even number with if methods
 */

import java.util.Scanner;

public class Prog6AnyOddEven {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");
            }

            input.close();
        }
    }

