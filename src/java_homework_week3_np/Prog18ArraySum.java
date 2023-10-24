package java_homework_week3_np;

public class Prog18ArraySum {

        public static void main(String[] args) {
            // Define an array of numbers
            int[] numbers = {5, 10, 15, 20, 25};
            // Initialize a variable to store the sum
            int sum = 0;
            // Use a loop to iterate through the array and calculate the sum
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            // Print the sum
            System.out.println("Sum of the array elements: " + sum);
        }
    }


