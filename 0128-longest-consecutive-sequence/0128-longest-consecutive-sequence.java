class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> hs =  new HashSet<>();

        for(int i:nums){
            if(!hs.contains(i)){
                hs.add(i);
            }
        }
        int max = 0;
        for(int i:hs){
            int k =1;
            if(!hs.contains(i-1)){
                while(hs.contains(i+k)){
                    k++;
                }
            }
            max = Math.max(max,k);
        }
        return max;
    }
}