class Solution {

    private int find(int[] arr, int x, int i){
        for(int j= arr.length-1;j>=i;j--){
            if(arr[j]>x){
                return j;
            }
        }
        return i;
    }

    public void nextPermutation(int[] nums) {
        
        boolean mark = false;
        
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                mark = true;
                int idx = find(nums,nums[i-1],i-1);
                int swap = nums[i-1];
                nums[i-1] = nums[idx];
                nums[idx] = swap;
                int j=i;
                int k = nums.length-1;
                while(j<=k){
                    int temp = nums[j];
                    nums[j++] = nums[k];
                    nums[k--]=temp;
                }
                break;
            }
        }
        if(!mark){
            int j = 0;
            int k=nums.length-1;
            while(j<=k){
                int temp = nums[j];
                nums[j++] = nums[k];
                nums[k--]=temp;
            }
        }        
    }
}