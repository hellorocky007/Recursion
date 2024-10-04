
public class PalindromeOrNot {
    public static boolean isPalindrome(String str,int i){
        int j = str.length()-1-i;
        if(i>j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }else{
            i++;
            j--;
        return isPalindrome(str, i);
        }
        
    }
    public static void main(String[] args) {
        String str = "19691";
       boolean ans = isPalindrome(str,0);
        if(ans==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
