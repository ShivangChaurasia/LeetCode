class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i : nums){
            if(!hs.containsKey(i)){
                hs.put(i,1);
            }else{
                hs.put(i,hs.get(i)+1);
            }
        }

        for(int i : nums){
            if(i % 2 == 0 && hs.get(i) == 1){
                return i;
            }
        }

        return -1;
        
    }
}