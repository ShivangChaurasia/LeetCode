class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int temp=0;
        for(int i=0; i<nums.length;i++){
            if(count==0){
                temp = nums[i];
            }

            count += (nums[i]==temp) ? 1:-1;
        }
        return temp;
    }
}