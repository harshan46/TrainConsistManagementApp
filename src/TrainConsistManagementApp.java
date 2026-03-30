import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Step 2: Stream -> map -> reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // sum all values

        // Step 3: Display total seating capacity
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Verify original list remains unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}