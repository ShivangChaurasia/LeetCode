class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] bits = new Integer[arr.length];
        int j=0;
        for(int i:arr){
            bits[j++]=i;
        }
        Arrays.sort(bits, (a,b)->{
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if(bitA==bitB){
                return a-b;
            }
            return bitA-bitB;
        });
        int k=0;
        for(int i: bits){
            arr[k++]=i;
        }
        return arr;

    }
}