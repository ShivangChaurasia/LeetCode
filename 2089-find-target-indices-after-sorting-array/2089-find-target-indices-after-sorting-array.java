class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int tcnt=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                tcnt++;
            }else if(nums[i]<target){
                cnt++;
            }
        }
        for(int i=0;i<cnt+tcnt;i++){
            if(i>=cnt){
                res.add(i);
            }
        }
        return res;
    }
}