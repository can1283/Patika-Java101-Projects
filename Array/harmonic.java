public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonic mean of the array: " + harmonicMean);
    }

    public static double calculateHarmonicMean(int[] numbers) {
        double reciprocalSum = 0.0;
        for (int num : numbers) {
            reciprocalSum += 1.0 / num;
        }
        return numbers.length / reciprocalSum;
    }
}
