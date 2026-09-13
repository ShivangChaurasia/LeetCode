class Solution {
    public void reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] m) {
        int n = m.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = m[i][j];
                m[i][j]=m[j][i];
                m[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            reverse(m[i]);
        }
        
    }
}