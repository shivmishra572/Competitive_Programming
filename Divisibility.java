import java.util.*;

class TestClass {

    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = sc.nextInt();
        }
        if(data[N-1]%10 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
