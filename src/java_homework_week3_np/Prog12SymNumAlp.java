package java_homework_week3_np;

import java.util.Scanner;

public class Prog12SymNumAlp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("You entered a number.");
        } else if (Character.isLetter(ch)) {
            System.out.println("You entered an alphabet.");
        } else {
            System.out.println("You entered a symbol.");
        }
        input.close();
    }
}

