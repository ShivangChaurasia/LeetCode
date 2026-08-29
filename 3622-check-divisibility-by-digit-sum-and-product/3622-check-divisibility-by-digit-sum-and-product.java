class Solution {
    public boolean checkDivisibility(int n) {

        int pdt = 1;
        int sum=0;
        int temp=n;
        while(temp>0){
            int n1 = temp%10;
            pdt*=n1;
            sum+=n1;
            temp=temp/10;
        }
        return n%(pdt+sum)==0;
        
    }
}