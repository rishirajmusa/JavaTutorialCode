import java.util.*;
//Solving it with mod 1000000007 because value is too high,
//as it became a tribonacci series too
class TripleStep {
    int numberOfWays(int n) {
        int a=1;
     int b=2;
     int c=4;
     int d=0;
     int m=1000000007;
      if(n<3){
          return n;
      }
      else if(n==3){
          return 4;
      }
      else{
          while(n>=4){
         d=((a+b)%m+c)%m;
         a=b;
         b=c;
         c=d;
         n--;
         System.out.println(d);
     }
     }
     return d;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TripleStep tripleStep = new TripleStep();
        int result = tripleStep.numberOfWays(n);
        System.out.println(result);
        scanner.close();
    }
}
