import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds.length == 0) {
            System.out.println("Bogie list is empty.");
            return false;
        }

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
                low = mid + 1;   // Search right half
            }
            else {
                high = mid - 1;  // Search left half
            }
        }

        System.out.println("Bogie ID not found.");
        return false;
    }

    public static void main(String[] args) {

        // Unsorted input (will be sorted before search)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Ensure sorted data (important for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Search key
        String searchKey = "BG309";

        System.out.println("\nSearching for: " + searchKey);
        boolean result = binarySearch(bogieIds, searchKey);
        System.out.println("Search Result: " + result);


        // -------- Additional Test Cases --------

        // Not found
        binarySearch(bogieIds, "BG999");

        // First element
        binarySearch(bogieIds, "BG101");

        // Last element
        binarySearch(bogieIds, "BG550");

        // Single element
        String[] single = {"BG101"};
        Arrays.sort(single);
        binarySearch(single, "BG101");

        // Empty array
        String[] empty = {};
        binarySearch(empty, "BG101");
    }
}