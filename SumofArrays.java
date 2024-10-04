import java.util.Arrays;

public class SumofArrays {
    public static int findSum(int arr[],int n){
       if(n<=0){
        return 0;
       }
       return arr[n-1]+findSum(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,4,9,2,5};
        int n = arr.length;
       System.out.println(findSum(arr, n));
    }
}
