class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i : nums){
            arr[j++] = nums[i];
        }
        return arr;
    }
}