import java.util.*;
class TestClass {
    public static void pattern(int n){
        int i=0;
        for(;i<n;i++){
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
        }
        if(i==n){
            System.out.println("*   *");
            System.out.println("*   *");
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
