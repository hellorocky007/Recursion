import java.util.Scanner;
public class PowerN {
    public static int power(int n){
        if(n==0){
            return 1;
        }
        int num = 2*power(n-1);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = power(n);
        System.out.println(ans);
    }
}
