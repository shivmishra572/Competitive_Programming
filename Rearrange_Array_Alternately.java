class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        if(n==1) return;
        
        int[] temp = new int[n];
        int i=0;
        int j=n-1;
        int index = 0;
        while(index<n-1){
            temp[index++] = arr[j];
            temp[index++] = arr[i];
            j--;
            i++;
        }
        temp[n-1] = arr[j];
        
        for(int k=0;k<n;k++){
            arr[k] = temp[k];
        }
    }
}
