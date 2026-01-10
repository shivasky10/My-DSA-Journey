package Recursion;


// finding nth fibonacci number
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        int fib = fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    
}
