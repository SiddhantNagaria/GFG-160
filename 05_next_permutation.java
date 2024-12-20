
class Solution {

    static void nextPermutation(int[] arr) {
        int n = arr.length;

        //find pivot
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        //if pivot not found then reverse the whole array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        //find the element from right greater than pivot
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        //reverse the right part
        reverse(arr, pivot + 1, n - 1);
    }

    //reverse array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    //helper to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
