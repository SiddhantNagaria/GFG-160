class Solution{

    // using temporary array
    //time= O(n)
    //space= O(n)
    public static void reversearray(int arr[]){
        int n = arr.length;
        int[] temp = new int [n];
        for(int i = 0; i <n;i++){
            temp[i] = arr[n-1-i];
        }
        for(int i = 0; i<n;i++){
            arr[i] = arr[i];
        }
    }


    //two pointesr approach
    //time= O(n)
    //space= O(1)
    public static void ReverseArray(int arr[]){
        int left = 0 ,right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
}

