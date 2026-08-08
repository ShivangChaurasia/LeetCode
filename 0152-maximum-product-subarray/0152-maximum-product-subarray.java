class Solution {
    public int maxProduct(int[] nums) {

        int maxPdt = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int pdt1 = 1;
        int pdt2 = 1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pdt1*=nums[i];
            maxPdt = Math.max(maxPdt,pdt1);
            if(pdt1==0){
                pdt1 = 1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            pdt2*=nums[i];
            maxPdt = Math.max(maxPdt,pdt2);
            if(pdt2==0){
                pdt2 = 1;
            }
        }

        maxPdt = Math.max(max,maxPdt);

        return maxPdt;
    }
}