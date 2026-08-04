class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int j=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=j){
                ls.add(j);
                i--;
            }
            j++;
        }
        return ls;
    }
}