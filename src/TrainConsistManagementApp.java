import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical bogie → only Petroleum allowed
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Display bogie details
        System.out.println("\nBogie Details:");
        for (GoodsBogie b : bogies) {
            b.display();
        }
    }
}