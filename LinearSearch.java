import java.util.Arrays;

public class LinearSearch {
    public static boolean linearSearch(int arr[],int n,int k){
        if(n==0){
            return false; 
        }else if(arr[0]==k){
            return true;
        }else{
            return linearSearch(Arrays.copyOfRange(arr, 1, n), n-1, k);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,24,1,3,5,6};
        int n = arr.length;
        int k=3;
      boolean ans =   linearSearch(arr, n, k);
        if(ans){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
