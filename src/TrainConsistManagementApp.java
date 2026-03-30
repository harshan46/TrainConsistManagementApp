import java.util.*;

// Step 1: Create Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Bogie Class with Validation
class Bogie {
    String name;
    int capacity;

    // Constructor with validation
    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Step 3: Main Class
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));

            // Invalid bogie (will throw exception)
            bogies.add(new Bogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display only valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}