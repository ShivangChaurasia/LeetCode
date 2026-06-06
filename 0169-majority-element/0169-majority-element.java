class Solution {
    public int majorityElement(int[] nums) {
        // int count =0;
        // int element =0;
        // for(int i : nums){
        //     if(count==0){
        //         element=i;
        //     }
        //     count += (i==element)?1:-1;
        // }
        // return element;

        int count = 0, element = 0;
        for (int i : nums){
            if (count == 0) element = i;
            count += (i == element) ? 1 : -1;
        }
        return element;


        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}