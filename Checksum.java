/*Description: In this problem you will build an application which calculates the checksum of a dataset.
The input is a string with several rows. example input: "5 1 9 5\n" + "7 5 3\n" + "2 4 6 8".
The first row's largest and smallest values are 9 and 1, the difference is 8.
The second's row largest and smallest values are 7 and 3, the difference is 4.
The third row's largest and smallest value is 8 and 2, the difference is 6. The checksum is the sum of all this differences.
 */

public class Checksum {
    public static void main(String[] args) {
        String input = "5 1 9 5\n" +
                       "7 5 3\n" +
                       "2 4 6 8";
        System.out.println(checkSum(input));
    }

    private static int checkSum(String input) {
        // Split the input string into an array of rows
        String[] rows = input.split("\n");
        // Initialize the checksum to zero
        int checksum = 0;
        // Loop through each row
        for (String row : rows) {
            // Split the row into an array of integers
            String[] numbers = row.trim().split("\\s+");

            // Initialize the minimum and maximum values to the first number in the row
            int min = Integer.parseInt(numbers[0]);
            int max = Integer.parseInt(numbers[0]);

            // Loop through the rest of the numbers in the row
            for (int i = 1; i < numbers.length; i++) {
                // Convert the number to an integer
                int value = Integer.parseInt(numbers[i]);
                System.out.println(numbers[i]);
                // Update the minimum and maximum values if necessary
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("MAX IS "+ max + " MIN IS " + min);
            int difference = max - min;
            System.out.println("difference " + difference);

            // Add the difference between the maximum and minimum values to the checksum
            checksum += (max - min);
        }

        // Return the final checksum
        return checksum;
    }
}
