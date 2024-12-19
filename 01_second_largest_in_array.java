
import java.util.Arrays;

//O(nlogn) time
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


//O(n) time and best approach in one pass only
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

