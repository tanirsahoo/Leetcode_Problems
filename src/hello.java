import java.util.*;

public class hello {

    public static void minimumDifference(List<Integer> measurements) {
        if (measurements == null || measurements.size() < 2) {
            System.out.println("Insufficient data to calculate differences.");
            return;
        }

        // Sort the array to calculate differences between consecutive elements
        Collections.sort(measurements);
        System.out.println(measurements);

        // Initialize variables to find the minimum difference
        int minDifference = Integer.MAX_VALUE;
        List<String> resultPairs = new ArrayList<>();

        // Calculate the minimum difference
        for (int i = 0; i < measurements.size() - 1; i++) {
            int diff = Math.abs(measurements.get(i + 1) - measurements.get(i));

            if (diff < minDifference) {
                minDifference = diff;
                resultPairs.clear(); // Clear old pairs since we found a smaller difference
                resultPairs.add(measurements.get(i) + " " + measurements.get(i + 1));
            } else if (diff == minDifference) {
                resultPairs.add(measurements.get(i) + " " + measurements.get(i + 1));
            }
        }

        // Print the pairs with the minimum difference
        for (String pair : resultPairs) {
            System.out.println(pair);
        }
    }

    public static void main(String[] args) {
        List<Integer> sampleInput = Arrays.asList(-1, 3, 6, -5, 0);
        System.out.println("Input list: " + sampleInput);
        System.out.println("Pairs with minimum possible difference:");
        minimumDifference(sampleInput);
    }
}

