public class TrainConsistManagementApp {

    // Method to perform Linear Search
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                System.out.println("Bogie ID found at position: " + i);
                return true; // Early termination
            }
        }

        // If not found
        System.out.println("Bogie ID not found.");
        return false;
    }

    public static void main(String[] args) {

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Perform Linear Search
        boolean result = linearSearch(bogieIds, searchKey);

        System.out.println("Search Result: " + result);


        // -------- Additional Test Cases --------

        // Not found case
        linearSearch(bogieIds, "BG999");

        // First element match
        linearSearch(bogieIds, "BG101");

        // Last element match
        linearSearch(bogieIds, "BG550");

        // Single element array
        String[] single = {"BG101"};
        linearSearch(single, "BG101");
    }
}