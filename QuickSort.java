import java.util.*;

public class QuickSort {
    public static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int i = s;
        for (int j = s + 1; j <= e; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, s, i);
        return i;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int p = partition(arr, s, e);
        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,2,6,0};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
