public class Recursion1 {
    // 1.
    public static void printNumbers5to1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers5to1(n-1);
    }
    //2.
    public static void printNumbers1to5(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers1to5(n+1);
    }
    //3.
    public static void printSumOfNnaturalNumbers(int n, int sum){
        if(n ==0){
            System.out.println(sum);
            return;
        }
        sum = sum +n;
        printSumOfNnaturalNumbers( n-1, sum);
    }
    //4.
    public static void printFactorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        printFactorial(n-1, fact);
    }
    //5.
    public static void printFibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        printFibonacci(b, a+b, n-1);
    }
    //6.
    public static int printPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = printPower(x, n-1);
        int xn = x*x_;
        return xn;

    }
    //7.
    public static int printPowerWithStackLengthlog_n(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2== 0){
            return printPowerWithStackLengthlog_n(x, n/2)*printPowerWithStackLengthlog_n(x, n/2);
        }else{
            return x*printPowerWithStackLengthlog_n(x, n/2)*printPowerWithStackLengthlog_n(x, n/2);

        }
    }

    public static void main(String[] args) {
       printNumbers5to1(5);
       printNumbers1to5(1);
       printSumOfNnaturalNumbers(5, 0);
       printFactorial(5, 1);
       printFibonacci(0,1,5);
       System.out.println(printPower(2,5));
       System.out.println(printPowerWithStackLengthlog_n(2,5));

        
        
    }
    
}
