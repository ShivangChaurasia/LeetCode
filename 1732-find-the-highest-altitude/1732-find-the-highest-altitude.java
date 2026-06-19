class Solution {
    public int largestAltitude(int[] gain) {
        int point = 0;
        int n=gain.length;
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=point;
            if(i==n){
                break;
            }
            point+=gain[i];
        }
        int max = -101;
        for(int i=0;i<=n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}