class Solution{

    //time - O(n^2)
    //space - O(1)
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        for(int  i =0;i<n-1;i++){
            for(int j = i + 1; j<n-1;j++){
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    //time - O(n)
    //space - O(1)
    public static int maximumProfit(int [] prices){
        int minSoFar = prices[0];
        int res = 0;
        for(int i = 1; i<prices.length;i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            res  = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
}
