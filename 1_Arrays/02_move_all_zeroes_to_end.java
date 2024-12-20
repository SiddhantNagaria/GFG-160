class Solution{

    // time - O(n)
    //space - O(n)
    static void pushZeroesToEnd(int[] arr){
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for(int i = 0 ;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            temp[j]=0;
            j++;
        }
        for(int i = 0 ;i<n;i++){
            arr[i]=temp[i];
        }
    }



    //time = O(n)
    //space = O(1)
    static void pushzeroestoend(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
    }
}