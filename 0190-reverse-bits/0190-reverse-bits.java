class Solution {
    public int reverseBits(int n) {
        // Method 1

        int res = 0;
        for(int i=0;i<32;i++){
            res = res<<1;
            if((n&1)!=0){
                res = res+1;
            }
            n = n>>1;
        }
        return res;
        // Method 2
        // StringBuilder sb = new StringBuilder();
        // String bin = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        // sb.append(bin);
        // sb.reverse();
        // int num = Integer.parseInt(sb.toString(),2);
        // return num;
    }
}