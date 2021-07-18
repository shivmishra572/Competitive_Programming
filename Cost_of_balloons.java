import java.util.Scanner;

class TestClass {

    public static int costofballon(int costofgreen,int costofpurple,int problem1,int problem2){
        int mincost = Math.min(costofgreen,costofpurple);
        int minproblem = Math.min(problem1,problem2);
        int maxcost = Math.max(costofgreen,costofpurple);
        int maxproblem = Math.max(problem1,problem2);

        return (mincost*maxproblem + maxcost*minproblem);
    }

    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int testcases = sc.nextInt();
       for(int i=0;i<testcases;i++){
           int costofgreen = sc.nextInt();
           int costofpurple = sc.nextInt();
           int participants = sc.nextInt();
           int problem1 = 0;
           int problem2 = 0;
           for(int j=0;j<participants;j++){
               int temp1 = sc.nextInt();
               problem1 += temp1;
               int temp2 = sc.nextInt();
               problem2 +=temp2;
           }
           System.out.println(costofballon(costofgreen,costofpurple,problem1,problem2)); 
       }

    }
}
