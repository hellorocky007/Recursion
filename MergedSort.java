
public class MergedSort {
    public static void merge(int arr[],int s,int n){
        int mid = (s+n)/2;
        int n1=mid-s+1;
        int n2 =n-mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int strtIndex = s;
        for(int i=0;i<n1;i++){
            arr1[i]=arr[strtIndex++];
        }
        int strtindex1 = mid+1;
        for(int i=0;i<n2;i++){
            arr2[i]=arr[strtindex1++];
        }
        int index1 = 0;
        int index2 =0;
        int mainIndex=s;
        while(index1<n1 && index2<n2){
            if(arr1[index1]<arr2[index2]){
                arr[mainIndex++]=arr1[index1++];
            }else{
                arr[mainIndex++]=arr2[index2++];
            }
        }
        while(index1<n1){
             
                arr[mainIndex++]=arr1[index1++];
            
        }
         while(index2<n2){
             
                arr[mainIndex++]=arr2[index2++];
            
        }
    }
    public static void mergeSort(int arr[],int s,int n){
           if(s>=n){
            return;
           }
          int mid = (s+n)/2;
          // left array sort
          mergeSort(arr, s, mid);
          //right array sort
          mergeSort(arr, mid+1, n);

          merge(arr,s,n);

    }
    public static void main(String[] args) {
        int arr[]={2,1,7,4,3,6,5};
        int n= arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
