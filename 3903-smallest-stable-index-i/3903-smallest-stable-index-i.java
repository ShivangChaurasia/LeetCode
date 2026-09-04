class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        int i=0;
        int ans = -1;
        int[] arr = new int[n];
        while(i<n){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int j = 0; j<=i;j++){
                max = Math.max(max,nums[j]);
            }

            for(int j = i; j<n;j++){
                min = Math.min(min,nums[j]);

            }
            arr[i] = max-min;
            i++;

        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]<=k){
                return j;
            }
        }

        return ans;
        
    }
}