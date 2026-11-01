class Solution {
    public boolean equal(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public int minMoves(int[] nums) {

        int moves = 0;
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            moves += nums[i]-min;
        }
        return moves;

    }
}