class Solution {
    public int scoreDifference(int[] nums) {
        int firstP = 0;
        int secP = 0;
        boolean factive = true;

        for(int s=0;s<nums.length;s++){
            if(nums[s]%2!=0){
                factive = !factive;
            }
            if((s+1)%6==0){
                factive = !factive;
            }
            if(factive){
                firstP+=nums[s];
            }else{
                secP+=nums[s];
            }
        }
        return firstP - secP;
    }
}