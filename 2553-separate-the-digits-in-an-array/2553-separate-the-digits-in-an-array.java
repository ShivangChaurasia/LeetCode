class Solution {
    public int[] separateDigits(int[] nums) {

        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<nums.length;i++){
            sb.append(nums[i]);
        }

        char[] Charr =  sb.toString().toCharArray();
        int[] arr = new int[Charr.length];
        for(int i=0;i<Charr.length;i++){
            arr[i] =Charr[i]-'0';
        }
        return arr;
    }
}