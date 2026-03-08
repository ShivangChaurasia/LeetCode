class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n>0){
            int t = n%10;
            rev=rev*10+t;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}