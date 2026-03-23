import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> trainConsist = new ArrayList<>();

        // Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after addition
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie (AC Chair)
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("Bogies after removal: " + trainConsist);

        // Check if Sleeper exists
        boolean isSleeperPresent = trainConsist.contains("Sleeper");
        System.out.println("Is Sleeper present? " + isSleeperPresent);

        // Final state
        System.out.println("Final Train Consist: " + trainConsist);

        // Program continues...
    }
}
