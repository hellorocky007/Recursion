public class Power {
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
       if(p==1){
        return n;
       }
      int ans = power(n, p/2);
       if(p%2==0){
        return ans*ans;
       }else{
           return n*ans*ans;
       }
    }
    public static void main(String[] args) {
        int n = 2;
        int p=10;
       System.out.println(power(n,p)); 
    }
}
