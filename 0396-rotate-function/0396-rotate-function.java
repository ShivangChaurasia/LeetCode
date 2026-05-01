class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            curr+=(i*nums[i]);
        }
        int max = curr;
        for(int k=1;k<nums.length;k++){
            curr+=(sum-nums.length*nums[nums.length-k]);
            max = Math.max(curr,max);
        }
        return max;
    }
}