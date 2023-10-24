package java_homework_week3_np;
/**
 * input number . output should be even or odd number
 */

import java.util.Scanner;

public class Prog1OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner started
        System.out.println("Input a number : ");
        int number = scanner.nextInt();
        // find modulus of number. if reminder should be 0 or 1.
        String result =(number % 2==0) ? "Even": "Odd";// ternary operator
        System.out.println("number is " +result);
            scanner.close();
        }
    }

