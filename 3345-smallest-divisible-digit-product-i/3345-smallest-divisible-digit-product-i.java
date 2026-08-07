class Solution {
    public int smallestNumber(int n, int t) {
        boolean res = true;
        while(res){
            int num = n;
            int pdt = 1;
            while(num>0){
                int n1 = num%10;
                pdt*=n1;
                num/=10;
            }
            if(pdt%t==0){
                res=false;
                return n;
            }
            n++;
        }
        return n;
    }
}