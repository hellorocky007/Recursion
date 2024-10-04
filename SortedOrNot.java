import java.util.*;
public class SortedOrNot {
    public static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        } else {
            boolean restPart = isSorted(Arrays.copyOfRange(arr, 1, n), n - 1);
            return restPart;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 4, 5 };
        int n = 5;
        boolean ans = isSorted(arr, n);
        if (ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
