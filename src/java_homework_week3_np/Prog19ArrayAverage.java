package java_homework_week3_np;

public class Prog19ArrayAverage {

    public static void main(String[] args) {
        // Define an array of numbers
        double[] numbers = {5.0, 10.0, 15.0, 20.0, 25.0};
        // Initialize a variable to store the sum
        double sum = 0.0;
        // Calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Calculate the average
        double average = sum / numbers.length;
        // Print the average
        System.out.println("Average of the array elements: " + average);
    }
}





