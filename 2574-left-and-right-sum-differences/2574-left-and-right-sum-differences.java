class Solution {
    public int[] leftRightDifference(int[] nums) {
        int suml=0;
        int sumr=0;
        int n= nums.length;
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            lsum[i]=suml;
            rsum[n-1-i]=sumr;
            suml+=nums[i];
            sumr+=nums[n-1-i];
        }

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(lsum[i]-rsum[i]);
        }

        return ans;
    }
}