class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = n-2; i>=0;i--){
            if(arr[n-2]!=arr[n-1]) return arr[i];
        }
        return -1;
    }
}
