import java.util.Arrays;

public class RepeatingNumbers {

    // Check if a value exists in the array
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    };

    public static void main(String[] args) {

        int[] list = {3, 7, 7, 8, 3, 5, 8, 8, 9, 12, 21, 21, 22, 22, 10, 10};

        // Array to store duplicate numbers
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // Iterate through the list to find duplicates
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    // If the number is not already in the duplicate array, add it
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        // Print even duplicate numbers
        for (int value : duplicate) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }

    }
}
