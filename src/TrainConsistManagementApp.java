class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;   // Rectangular or Cylindrical
    private String cargo;   // Assigned cargo

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            System.out.println("\nAttempting to assign cargo: " + cargoType + " to " + shape + " bogie");

            // Validation logic
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe Assignment: Petroleum cannot be loaded in Rectangular Bogie!");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully!");

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Assignment process completed (Logged).");
        }
    }

    public void display() {
        System.out.println("Bogie Shape: " + shape + " | Cargo: " + (cargo != null ? cargo : "None"));
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");

        // Safe assignment
        bogie1.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        bogie2.assignCargo("Petroleum");

        // Program continues after exception
        bogie2.assignCargo("Coal");

        // Display final status
        System.out.println("\nFinal Bogie Status:");
        bogie1.display();
        bogie2.display();
    }
}