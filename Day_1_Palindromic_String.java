import java.util.*;

class TestClass {

    public static String pallindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return "NO";
            }
            i++;
            j--;
        }
        return "YES";
    }
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       System.out.println(pallindrome(s));
    }
}
