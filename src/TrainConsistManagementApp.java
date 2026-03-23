import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("After adding Pantry Car: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final train consist
        System.out.println("Final Train Consist: " + trainConsist);

        // Program continues...
    }
}