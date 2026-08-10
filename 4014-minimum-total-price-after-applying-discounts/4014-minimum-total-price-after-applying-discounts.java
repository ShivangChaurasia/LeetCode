class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p = prices.length;
        int d = discounts.length;
        double total=0;
        int len = Math.min(prices.length,discounts.length);
        for(int i=1;i<=len;i++){
            total +=(prices[p-i]*(100.0-discounts[d-i])/100.0);
        }
        for(int i=0 ; i<p-len;i++){
            total+=prices[i];
        }

        return total;
    }
}