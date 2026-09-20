class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int mul = (('z'-s.charAt(i))+1)*(i+1);
            sum+=mul;
        }
        return sum;
    }
}