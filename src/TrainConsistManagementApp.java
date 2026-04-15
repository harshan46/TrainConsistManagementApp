class TrainConsistManagementApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to display array
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        display(capacities);

        // Sorting using Bubble Sort
        bubbleSort(capacities);

        System.out.println("After Sorting (Ascending):");
        display(capacities);

        // Additional test cases

        // Already sorted
        int[] sortedArray = {24, 56, 60, 70, 72};
        bubbleSort(sortedArray);

        // Duplicate values
        int[] duplicateArray = {72, 56, 56, 24};
        bubbleSort(duplicateArray);

        // Single element
        int[] single = {50};
        bubbleSort(single);

        // All equal
        int[] equal = {40, 40, 40};
        bubbleSort(equal);
    }
}