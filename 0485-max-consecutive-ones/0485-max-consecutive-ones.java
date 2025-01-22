class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Initialize count of consecutive ones
        int currentCount = 0; 
        // Initialize the maximum count of consecutive ones
        int maxCount = 0; 

        // Iterate over each element in the array
        for (int value : nums) {
            if (value == 1) {
                // If the current element is 1, increment the current count
                currentCount++;
            } else {
                // If the current element is not 1, update the maxCount if the current count is greater than maxCount
                maxCount = Math.max(maxCount, currentCount);
                // Reset the current count to zero
                currentCount = 0; 
            }
        }

        // In case the array ends with a sequence of ones, make sure to update the maxCount
        maxCount = Math.max(currentCount, maxCount);

        // Return the maximum count of consecutive ones found in the array
        return maxCount;
    }
}