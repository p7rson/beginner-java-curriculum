public class BiggestInArray {
    public static void main(String[] args) {
        int[] nums = {12, 7, 33, 5, 18};

        int smallest = nums[0];  // Start by assuming the first item is the smallest
        for (int i = 0; i < nums.length; i++) {  // Go through each item in the array
            if (nums[i] < smallest) {  // If we find something smaller, update our guess
                smallest = nums[i];
            }
        }

        System.out.println("The smallest item: " + smallest);
    }
}