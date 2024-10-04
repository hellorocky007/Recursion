import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[],int n){
              if(n==0||n==1){
                return;
              }
              for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                  int temp = arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
                }
              }
              bubbleSort(arr, n-1);
    }
   public static void main(String[] args) {
    int arr[]={2,1,4,3,5};
    int n=5;
    bubbleSort(arr,n);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
   } 
}
