import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search with Fail-Fast Validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Check (Defensive Programming)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Ensure sorted data for Binary Search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                System.out.println("Bogie ID found at position: " + mid);
                return true;
            }
            else if (result < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Bogie ID not found.");
        return false;
    }

    public static void main(String[] args) {

        // -------- Test Case 1: Empty Array (Should Throw Exception) --------
        try {
            String[] empty = {};
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // -------- Test Case 2: Valid Search --------
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        try {
            boolean result = searchBogie(bogieIds, "BG205");
            System.out.println("Search Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // -------- Test Case 3: Not Found --------
        try {
            boolean result = searchBogie(bogieIds, "BG999");
            System.out.println("Search Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // -------- Test Case 4: Single Element --------
        try {
            String[] single = {"BG101"};
            boolean result = searchBogie(single, "BG101");
            System.out.println("Search Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}