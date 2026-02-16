class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        String bin = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        sb.append(bin);
        sb.reverse();
        int num = Integer.parseInt(sb.toString(),2);
        return num;
    }
}