
import java.util.Scanner;

public class Methods{
    public static void  print(){
        System.out.println("hello world");
        System.out.println("hello world-2");
    }

    public static int sumofno(int num1 , int num2){
        int sum = num1+num2;
        return sum;
    }
    public static int fact(int n){
         int f =1;
         for ( int i=1;i<=n;i++){
            f=f*i;
         }
         return f;
    }

    public static int bincoeff(int n , int r){
        int nfact=fact(n);
        int rfact=fact(r);
        int rf_fact = fact(n-r);
        int coeff = nfact/(rfact * rf_fact);
        return  coeff;
    }

    //method overloading 

    public static int sum(int a , int b){
        return a+b;
    }

    public static int sum(int a, int b , int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    //prime or not in optimized way
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i +" ");
            }
        }
        
        
    }

    public static void bintodec(int bin){
        int mynum = bin;
        int pow =0;
        int dec =0;
        while(bin>0){
            int last = bin %10;
            dec = dec +(last*(int)Math.pow(2,pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("decima of "+mynum +"is " +dec);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        // int r= sc.nextInt();
        // System.out.println("coeff is " +bincoeff(n,r));
        // System.out.println(sum(5,10));
        // System.out.println(sum(1,2,3));
        // System.out.println(sum(2.5f,3.2f));
        primerange(60);
        bintodec(1011);
        

    
       
        // int sum =  sumofno(a,b);
        // System.out.println("sum is "+sum);

    }
}