class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max);
            sum+=nums[i];
        }
        return (nums.length*max)-sum;
    }
}