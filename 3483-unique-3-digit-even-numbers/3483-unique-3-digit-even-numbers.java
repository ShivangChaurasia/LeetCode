class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        for(int i=100;i<=999;i++){
            boolean status = true;
            if(i%2==0){
                int[] freq = new int[10];
                for(int j : digits){
                    freq[j]++;
                }

                int temp = i;
                while(temp>0){
                    int n1 = temp%10;
                    freq[n1]--;
                    temp/=10;
                }

                for(int j : freq){
                    if(j<0){
                        status=false;
                        break;
                    }
                }

                if(status){
                    count++;
                }
            }
        }

        return count;
        
    }
}