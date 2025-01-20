class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0], lastPre = nums[0];
        for(int i=1; i<nums.length && nums[i] == lastPre+1; i++){
            sum += nums[i];
            lastPre = nums[i];
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        while(set.contains(sum)) sum++;
        return sum;
    }
}