class Solution {
    static {
        Solution solver = new Solution();
        for (int i = 0; i < 500; i++) {
            solver.minPartitions("0");
        }
    }
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0;i<n.length();i++){
            max = Math.max((n.charAt(i)-'0'), max);
        }

        return max;
        
    }
}