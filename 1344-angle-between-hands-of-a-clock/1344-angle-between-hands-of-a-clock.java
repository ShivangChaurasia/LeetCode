class Solution {
    public double angleClock(int hr, int min) {
        double minDeg = min*6;
        double hrDeg = ((hr==12) ? 0:hr*30) + (min*0.5);
        double finDeg = Math.abs(minDeg - hrDeg);
        return Math.min(Math.abs(360-finDeg),finDeg);

        
    }
}