public class BinarySearch {
    public static void printArray(int arr[],int s,int r){
        for(int i=s;i<=r;i++){
       System.out.print(arr[i]+" ");
        }
               System.out.println();
    }
    public static boolean isBinarySearch(int arr[],int k,int left,int right){
                 printArray(arr, left, right);
                 if(left>right){
                    return false;
                 }
                 int mid=left +(right-left)/2;
                 if(arr[mid]==k){
                    return true;
                 }else if(arr[mid]<k){
                    return  isBinarySearch(arr, k, mid+1,right);
                 }else{
                     return isBinarySearch(arr, k, left, mid-1);
                 }
             
                 
    }
    public static void main(String[] args) {
        int arr[] ={1,2,5,8,12,54,60};
        int n=arr.length;
        int k=60;
        boolean ans =  isBinarySearch(arr, k, 0, n-1);
          System.out.println(ans);
    }
}
