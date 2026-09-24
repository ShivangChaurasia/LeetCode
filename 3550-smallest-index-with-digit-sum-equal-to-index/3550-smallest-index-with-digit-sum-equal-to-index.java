class Solution {
    public int digSum(int n){
        int sum=0;
        while(n>0){
            int n1 = n%10;
            sum+=n1;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digSum(nums[i])){
                return i;
            }
        }
        return -1;
    }
}