public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        // Create two separate arrays to store elements and frequencies
        int[] elements = new int[array.length];
        int[] frequencies = new int[array.length];

        int elementCount = 0; // To keep track of the number of unique elements

        // Iterate through the array to find frequencies of elements
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean elementExists = false;

            // Check if the element already exists in the elements array
            for (int j = 0; j < elementCount; j++) {
                if (element == elements[j]) {
                    // Element already exists, increment its frequency
                    frequencies[j]++;
                    elementExists = true;
                    break;
                }
            }

            // If the element doesn't exist in the elements array, add it as a new element
            if (!elementExists) {
                elements[elementCount] = element;
                frequencies[elementCount] = 1;
                elementCount++;
            }
        }

        // Print the frequencies of the elements
        for (int i = 0; i < elementCount; i++) {
            System.out.println(elements[i] + " appeared " + frequencies[i] + " times.");
        }
    }
}
