public class ReverseString {
    public static String reverseString(String str){
        if(str.isEmpty()|| str.length()==1){
         return str;
        }
       String revString= reverseString(str.substring(0, str.length()-1));
        return str.charAt(str.length()-1)+revString;
        
    }
public static void main(String[] args) {
        String str ="Hello jay bardhan singh";
       String revString= reverseString(str);
        System.out.println(revString);

            

}
}
