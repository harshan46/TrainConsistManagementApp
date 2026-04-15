import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Example bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        System.out.println("After Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));


        // -------- Additional Test Cases --------

        // Unsorted input
        String[] unsorted = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(unsorted);

        // Already sorted
        String[] sorted = {"AC Chair", "First Class", "General"};
        Arrays.sort(sorted);

        // Duplicate values
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);

        // Single element
        String[] single = {"Sleeper"};
        Arrays.sort(single);
    }
}