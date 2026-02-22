class Solution {
    public int factorial(int n){
        int fact = 1;
        if(n==0){
            return 1;
        }
        fact = fact * n;
        return fact * factorial(n-1);  
    }
    public boolean isDigitorialPermutation(int n) {
        int temp = n;
        int sum = 0;
        while(temp>0){
            int n1 = temp%10;
            sum+=factorial(n1);
            temp/=10;
        }
            int sumTemp = sum;
            int originalTemp = n;
            int[] count = new int[10];
            while (originalTemp > 0) {
                count[originalTemp % 10]++;
                originalTemp /= 10;
            }
            while (sumTemp > 0) {
                count[sumTemp % 10]--;
                sumTemp /= 10;
            }
            for (int c : count) {
                if (c != 0) return false;
            }
            return true;
            
            }
}