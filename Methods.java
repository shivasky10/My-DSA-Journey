
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        System.out.println("coeff is " +bincoeff(n,r));
       
        // int sum =  sumofno(a,b);
        // System.out.println("sum is "+sum);

    }
}