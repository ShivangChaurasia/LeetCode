class Solution {

    public boolean find(int[] num, int x){
        for(int i:num){
            if(i==x){
                return true;
            }
        }
        return false;
    }

    public int missingMultiple(int[] nums, int k) {
        boolean found = true;
        int i = 1;
        int ans;

        while(found){
            int x = k*i++;
            if(!find(nums,x)){
                found = false;
                return x;
            }
        }

        return k*i;
    }
}