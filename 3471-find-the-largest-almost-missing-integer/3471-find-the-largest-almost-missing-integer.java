class Solution {
    public int largestInteger(int[] nums, int k) {
        int ele = -1;
        int n=nums.length;
        Map<Integer, Integer> hm = new HashMap<>();

        int i=0;
        int j=k-1;
        while(j<n){
            int st = i;
            int end = j;
            Set<Integer> sub = new HashSet<>();
            while(st<=end){
                if(!sub.contains(nums[st])){
                    sub.add(nums[st]);
                    hm.put(nums[st],hm.getOrDefault(nums[st],0)+1);
                }
                st++;
            }
            i++;
            j++;
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getKey()>ele){
                if(e.getValue()==1){
                    ele=e.getKey();
                }
            }
        }

        return ele;
    }
}