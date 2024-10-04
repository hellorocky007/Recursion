import java.util.Scanner;
public class Factorial {
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
       int fact = n* findFactorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = findFactorial(n);
        System.out.println(num);
    }
}
