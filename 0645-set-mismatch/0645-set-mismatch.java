class Solution {
    public int[] findErrorNums(int[] nums) {


        boolean[] arr = new boolean[nums.length+1];

        int[] result = new int[2];

        for(int num:nums){
            if(arr[num]==true){
                result[0]=num;
            }else{
                arr[num]=true;
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==false){
                result[1]=i;
            }
        }

        return result;


    }
}