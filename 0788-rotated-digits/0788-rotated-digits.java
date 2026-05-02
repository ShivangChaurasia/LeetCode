class Solution {
    public int rotatedDigits(int n) {
        if(n==1){
            return 0;
        }

        int count=0;
        for(int i=1;i<=n;i++){
            if(i==2 || i==5 || i==6 || i==9){
                count++;
            }
            if(i>10){
                int n1=i;
                boolean changed= false;
                boolean invalid = false;

                while(n1>0){

                    int remain = n1%10;
                    if(remain==3 || remain==4 || remain==7){
                        invalid = true;
                        break;
                    }
                    if(remain==2 || remain==5 || remain==6 || remain==9){
                        changed = true;
                    }
                    n1=n1/10;
                }
                if(!invalid && changed){
                    count++;
                }
            }
        }

        return count;
        
    }
}