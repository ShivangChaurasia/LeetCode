class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int max = 0;
        int j=0;
        int count=0;
        int dist1 = 0;
        int dist2 = 0;
        for(char i : str.toCharArray()){
            if(i=='1'){
                count++;
                dist2 = dist1;
                dist1 = j;
            }
            if(count>1){
                max = Math.max(max,(dist1-dist2));
            }
            j++;
        }
        return max;
    }
}