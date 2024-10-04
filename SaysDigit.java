import java.util.*;
public class SaysDigit {
   
    public static String solve(int n,String ans,String[] words){
        if(n==0){
            return ans;
        }
        int rem = n%10;
        ans = words[rem] +" "+ ans;
        return solve(n/10,ans,words);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordsDigit ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String ans ="";
       String str =  solve(n,ans,wordsDigit);

        System.out.println(str);

    }
    
}
