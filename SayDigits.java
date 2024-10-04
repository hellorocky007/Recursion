import java.util.*;
public class SayDigits {
    public static void sayDigits(int n,String str[]){
        if(n==0){
            return;
        }
        int rem = n%10;
        n=n/10;
        sayDigits(n, str);
        System.out.print(str[rem]+" ");
    }
    public static void main(String[] args) {
        String str[]={
            "zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"
        };
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sayDigits(n,str);

    }
}
