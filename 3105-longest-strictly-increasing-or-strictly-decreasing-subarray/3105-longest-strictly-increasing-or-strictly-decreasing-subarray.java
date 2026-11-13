class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int max = count;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                max = Math.max(count,max);
                count=1;
            }else if(nums[i]<nums[i+1]){
                max = Math.max(count,max);
                if(i!=0 && nums[i-1]>nums[i]){
                    count=1;
                }
                count++;
            }else{
                max=Math.max(count,max);
                if(i!=0 && nums[i-1]<nums[i]){
                    count=1;
                }
                count++;
            }
        }
        max = Math.max(count,max);

        return max;
    }
}