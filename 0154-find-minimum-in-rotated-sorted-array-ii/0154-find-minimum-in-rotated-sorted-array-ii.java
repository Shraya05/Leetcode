class Solution {
    // Partition function
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];  // Choosing the first element as the pivot
        int i = low + 1;        // Start scanning from the next element
        int j = high;           // Start scanning from the end

        while (true) {
            // Find element greater than or equal to pivot from the left
            while (i <= high && nums[i] <= pivot) {
                i++;
            }
            // Find element less than or equal to pivot from the right
            while (j >= low && nums[j] > pivot) {
                j--;
            }
            // If the indices have crossed, break out of the loop
            if (i >= j) {
                break;
            }
            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Place the pivot in its correct position
        nums[low] = nums[j];
        nums[j] = pivot;

        return j;  // Return the pivot's final index
    }

    // Quick Sort function
    public static void qs(int low, int high, int[] nums) {
        if (low < high) {
            int pindex = partition(nums, low, high);  // Get partition index
            qs(low, pindex - 1, nums);                // Sort the left side
            qs(pindex + 1, high, nums);               // Sort the right side
        }
    }

    // Method to find the minimum element by sorting the array
    public int findMin(int[] nums) {
        qs(0, nums.length - 1, nums);  // Sort the array using quicksort
        return nums[0];                 // The first element will be the minimum
    }
}
