class Solution{

    //time - O(n^2)
    //space - O(1)
    public static int maxSubArray(int[] arr){
        int res = arr[0];
        for(int i = 0; i<arr.length;i++){
            int currsum = 0;
            for(int j = 0; j<arr.length;j++){
                currsum += arr[j];
                res = Math.max(res, currsum);
            }
        }
        return res;
    }

    //time - O(n)
    //space - O(1)
    //kadane's algorithm
    static int maxsubarraysum(int [] arr){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i = 1; i<arr.length;i++){
            maxEnding = Math.max(arr[i], maxEnding+arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}