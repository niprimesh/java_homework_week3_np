package java_homework_week3_np;
/**
 * input year ; output should be leap year or not leap year.
 */

import java.util.Scanner;

public class Prog2Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner called
        System.out.println("Please input year in YYYY format :");
        int Year = scanner.nextInt();
        //if remainder of modulus is zero then leap year or not leap  year.
        if (Year % 4 > 0) {
            System.out.println(+ Year + " is not leap year");
        } else {
            System.out.println(+ Year + " is leap year");
        }
        scanner.close();//scanner closed
    }
}