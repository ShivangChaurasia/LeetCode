class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        long original = 0 ;
        long mul=1;
        while(n>0){
            int n1= n%10;
            if(n1!=0){
                sum+=n1;
                original+=(n1*mul);
                mul*=10;
            }


            n/=10;
        }
        return original*sum;
    }
}