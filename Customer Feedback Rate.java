import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store ratings and counts
        int[] ratingCount = new int[5]; // Array to count ratings from 1 to 5
        int totalRatings = 0;
        int sumRatings = 0;
        boolean excellentRating = false;
        int rating;

        // Sentinel-Controlled Loop (while loop) to collect ratings
        System.out.println("Please enter customer ratings from 1 to 5. Enter -1 to stop.");
        
        while (true) {
            System.out.print("Enter rating (1-5 or -1 to stop): ");
            rating = scanner.nextInt();

            if (rating == -1) {
                break; // Exit the loop if the sentinel value is entered
            } else if (rating < 1 || rating > 5) {
                System.out.println("Invalid rating! Please enter a value between 1 and 5.");
            } else {
                // Increment the appropriate rating count
                ratingCount[rating - 1]++;
                totalRatings++;
                sumRatings += rating;

                // Flag-Controlled Loop (while loop) to check for an Excellent rating (5)
                if (rating == 5) {
                    excellentRating = true;
                }
            }
        }

        // Display a message if an excellent rating was received
        if (excellentRating) {
            System.out.println("Excellent rating received!");
        }

        // Counter-Controlled Loop (for loop) to display rating counts
        System.out.println("\nSummary Report:");
        System.out.println("Total ratings: " + totalRatings);

        if (totalRatings > 0) {
            double averageRating = (double) sumRatings / totalRatings;
            System.out.println("Average rating: " + String.format("%.2f", averageRating));
        } else {
            System.out.println("Average rating: N/A (No ratings provided)");
        }

        // Display count of each rating from 1 to 5
        for (int i = 0; i < ratingCount.length; i++) {
            System.out.println((i + 1) + "-star ratings: " + ratingCount[i]);
        }

        scanner.close();
    }
}