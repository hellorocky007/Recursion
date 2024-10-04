import java.util.*;
public class Countion {
    public static void counting(int n){
        if(n==0){
            return;
        }
        counting(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    counting(n);
    }
   
}
