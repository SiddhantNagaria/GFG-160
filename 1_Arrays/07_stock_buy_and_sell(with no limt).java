class Solution {
    //using recursion
    public static int maxProfit(int[] prices, int start, int end) {
        int res = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if(prices[j]>prices[i]){
                    int curr = prices[j] - prices[i] + maxProfit(prices, start, i-1)+maxProfit(prices, j+1, end);
                    res = Math.max(res, curr);
                }
            }
        }
        return res;
    }
    
    public static int maxProfitRec(int[] prices) {
        return maxProfit(prices, 0, prices.length-1);
    }

    //time O(n)
    //space O(1)
    //local minima and maxima
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int lmin = prices[0];
        int lmax = prices[0];
        int res = 0;
        int i = 0;
        while(i<n-1){
            while(i<n-1 && prices[i]>=prices[i+1]) {
                i++;
            }
            lmin = prices[i];
            while(i<n-1 && prices[i]<=prices[i+1]) {
                i++;
            }
            lmax = prices[i];
            res += lmax - lmin;
        }
        return res;
    }

    //time O(n)
    //space O(1)
    //accumulate profit
    public static int maximumProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                res+= prices[i]-prices[i-1];
            }
        }
        return res;
    }
}