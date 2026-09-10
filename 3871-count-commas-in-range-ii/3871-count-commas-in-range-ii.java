class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        int size = 0;
        long temp = n;
        while(temp>0){
            size++;
            temp/=10;
        }
        if(size>3 && size<7){
            return n-999;
        }else if(size>6 && size<10){
            return ((n-999999)*2)+(999999-999);
        }else if(size>9 && size<13){
            return ((n-999999999)*3)+((999999999-999999)*2)+(999999-999);
        }else if(size>12 && size<16){
            return ((n-999999999999L)*4)+((999999999999L-999999999L)*3)+((999999999L-999999L)*2)+(999999-999);
        }else{
             return ((n - 999999999999999L) * 5) + ((999999999999999L - 999999999999L) * 4) + ((999999999999L - 999999999L) * 3) + ((999999999L - 999999L) * 2) + (999999L - 999L);
        }
    }
}