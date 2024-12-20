class Solution{

    //time - O(n*d)
    //space - O(1)
    public static void rotate(int[] arr, int d){
        int n = arr.length;
        for(int i =0;i<d;i++){
            int first = arr[0];
            for(int j = 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] =first;
        }
    }

    //using temp array
    //time - O(n)
    //space - O(n)
    public static void rotatearray(int[] arr, int d){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i = 0;i<n;i++){
            temp[(i+d)%n] = arr[i];
        }
        for(int i = 0;i<n;i++){
            arr[i] = temp[i];
        }
    }

    //using reversal
    //time - O(n)
    //space - O(1)
    public static void rotatearrayusingreversal(int[] arr, int d){
        int n = arr.length;
        d%=n;
        reversearray(arr,0,d-1);
        reversearray(arr,d,n-1);
        reversearray(arr,0,n-1);
    }
    public static void reversearray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}