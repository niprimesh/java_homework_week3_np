package java_homework_week3_np;

public class Prog20SpecificValueArray {
    public static void main(String[] args) {
        // Define an array of values
        int[] numbers = {5, 10, 15, 20, 25};
        // Specify the value to check for
        int targetValue = 12;
        // Initialize a variable to track if the value is found
        boolean found = false;
        // Use a loop to iterate through the array and check for the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Exit the loop when the value is found
            }
        }
        // Print the result
        if (found) {
            System.out.println("The array contains the target value: " + targetValue);
        } else {
            System.out.println("The array does not contain the target value: " + targetValue);
        }
    }
}








