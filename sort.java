public class Remove{  
    public static int dub(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0; 
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {1,2,3,3,4,4,5,5,6,6,7};  
        int size = arr.length;  
        size= dub(arr, size);  
        
        for (int i=0; i<size; i++)
           System.out.print(arr[i]+" ");  
    }  
}  
