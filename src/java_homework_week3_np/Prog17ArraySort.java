package java_homework_week3_np;

import java.util.Arrays;

public class Prog17ArraySort {

        public static void main(String[] args) {
            // Numeric array
            int[] numericArray = {5, 2, 9, 1, 5, 6, 3};
            // String array
            String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
            // Sorting the numeric array
            Arrays.sort(numericArray);
            // Sorting the string array
            Arrays.sort(stringArray);
            // Printing the sorted numeric array
            System.out.println("Sorted Numeric Array:");
            for (int num : numericArray) {
                System.out.print(num + " ");
            }
            // Printing the sorted string array
            System.out.println("\nSorted String Array:");
            for (String str : stringArray) {
                System.out.print(str + " ");
            }
        }
    }

