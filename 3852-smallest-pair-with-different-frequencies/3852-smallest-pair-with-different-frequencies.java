class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int[] arr = new int[]{-1,-1};
        for(int i:nums){
            // if(!hs.containsKey(i)){
            //     hs.put(i,1);
            // }else{
                hs.put(i,hs.getOrDefault(i,0)+1);
            // }
        }
        TreeMap<Integer, Integer> sortedMap= new TreeMap<>(hs);
        int temp=0;
        int i=0;
        for(Map.Entry<Integer, Integer> e : sortedMap.entrySet()){
            if(e.getValue()!=temp && i<2){
                arr[i++]=e.getKey();
                temp = e.getValue();
            }
        }
        if (i < 2) {
            return new int[]{-1, -1};
        }
        return arr;
        
        
    }
}