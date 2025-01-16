class Solution {
  
    /**
     * Determines if n flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
     * @param flowerbed An array representing the flowerbed where 0 is an empty spot and 1 is a spot with a flower.
     * @param n The number of flowers we want to plant.
     * @return True if we can plant n flowers, otherwise false.
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Get the length of the flowerbed array.
        int length = flowerbed.length;
      
        // Iterate over all spots in the flowerbed.
        for (int i = 0; i < length; ++i) {
            // Check the spot to the left, it's 0 if we're at the first spot.
            int left = i == 0 ? 0 : flowerbed[i - 1];
            // Check the spot to the right, it's 0 if we're at the last spot.
            int right = i == length - 1 ? 0 : flowerbed[i + 1];
          
            // If the current, left, and right spots are all empty (i.e., 0),
            // then a flower can be planted at the current position.
            if (left + flowerbed[i] + right == 0) {
                // Plant the flower at the current position.
                flowerbed[i] = 1;
                // Decrease the remaining number of flowers to plant.
                --n;
            }
        }
      
        // If n is less than or equal to 0, then all flowers have been successfully planted.
        return n <= 0;
    }
}