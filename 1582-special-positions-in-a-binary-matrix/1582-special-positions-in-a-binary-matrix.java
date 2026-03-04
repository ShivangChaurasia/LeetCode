class Solution {

    public int numSpecial(int[][] mat) {
        int oneCount=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    int sum=0;
                    for(int k=0;k<mat.length;k++){
                        sum+=mat[k][j];
                    }
                    for(int l=0;l<mat[i].length;l++){
                        sum+=mat[i][l];
                    }
                    sum--;

                    if(sum==1){
                        oneCount++;
                    }
                }
            }
        }
        return oneCount;
    }
}