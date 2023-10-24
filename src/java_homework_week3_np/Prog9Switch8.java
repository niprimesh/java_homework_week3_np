package java_homework_week3_np;

import java.util.Scanner;

public class Prog9Switch8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an alphabet A to F: ");
        char alphabet = scanner.next().toUpperCase().charAt(0);
        String cityName = null;
        switch (alphabet) {
            case 'A':
                cityName = "America";
                break;
            case 'B':
                cityName = "Boston";
                break;
            case 'C':
                cityName = "Chicago";
                break;
            case 'D':
                cityName = "Dublin";
                break;
            case 'E':
                cityName = "Edingburgh";
                break;
            case 'F':
                cityName = "Frankfurt";
            default:
        }
        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}

