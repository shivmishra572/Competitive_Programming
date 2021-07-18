import java.util.*;

class TestClass {

    public static String divisibility(int[] arr){
        long total = 0;
        for(int i=0;i<arr.length;i++){
            total = total*10 + arr[i]%10;
        }
        
        if(total%10 != 0) return "No";
        return "Yes";
    }
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = sc.nextInt();
        }
        System.out.println(divisibility(data));
    }
}
