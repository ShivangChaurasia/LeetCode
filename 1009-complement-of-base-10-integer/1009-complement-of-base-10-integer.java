
class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int x = n;
        int len = 0;
        while(x!=0){
            len++;
            x=x>>1;
        }
        int pow = (int)Math.pow(2,len);
        int mask = (pow-1);
        return n^mask;
    }
}