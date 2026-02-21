class Solution {
    public int divide(int d1, int d2) {
        if(d1==Integer.MIN_VALUE && d2==-1)
            return Integer.MAX_VALUE;
        return d1/d2;
    }
}