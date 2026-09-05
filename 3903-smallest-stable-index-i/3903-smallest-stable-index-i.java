class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] max = new int[n];
        int[] min = new int[n];


        max[0] = nums[0];
        for(int j = 0; j<n-1;j++){
            max[j+1] = Math.max(max[j],nums[j+1]);
        }


        min[n-1] = nums[n-1];
        for(int j =n-2 ; j>=0;j--){
            min[j] = Math.min(min[j+1],nums[j]);
        }


        for(int j=0;j<n;j++){
            if((max[j]-min[j])<=k){
                return j;
            }
        }

        return -1;
        
    }
}