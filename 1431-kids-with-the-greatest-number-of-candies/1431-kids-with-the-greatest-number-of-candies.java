import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Find the maximum number of candies that any kid currently has.
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // List to store the results, whether each kid can have the maximum number
        // of candies after receiving extraCandies.
        List<Boolean> result = new ArrayList<>();

        // Loop through each kid's candies to determine if they can reach maxCandies
        // with their current candies plus extraCandies.
        for (int candy : candies) {
            // If the current kid's candies plus extraCandies is greater than or
            // equal to maxCandies, add 'true' to the result list, otherwise add 'false'.
            result.add(candy + extraCandies >= maxCandies);
        }

        // Return the result list.
        return result;
    }
}