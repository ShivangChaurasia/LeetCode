class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] preMax = new int[n];
        int[] postMin = new int[n];

        preMax[0] = nums[0];

        for(int i=0;i<n-1;i++){
            preMax[i+1] = Math.max(preMax[i],nums[i+1]);
        }
        postMin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            postMin[i] = Math.min(postMin[i+1],nums[i]);

        }

        for(int i=0;i<n;i++){
            if(preMax[i]-(postMin[i])<=k){
                return i;
            }
        }
        return -1;

    }
}