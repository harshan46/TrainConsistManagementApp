import java.util.*;

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

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogie objects
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Sort bogies by capacity (Ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies sorted by capacity (Ascending):");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort bogies by capacity (Descending)
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nBogies sorted by capacity (Descending):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}
