
import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int counter=0;
    //     while(counter<10){
    //         System.out.println("hello java");
    //         counter++;
    //     }
    //     for (int i=0;i<=10;i++){
    //         System.out.println(i +" " +"for loop");
    //     }
    //     System.out.println("loop completed");

    //     do { 
    //         System.out.println("enter a number");
    //         int num = sc.nextInt();
    //         if(num % 10 == 0){
    //             break;
    //         }else{
    //             System.out.println(num);
    //         }
    //     } while (true);
        System.out.println("enter number to check");
        int n = sc.nextInt();
        boolean isprime = true ;
        if(n==2){
            System.out.println("is prime");
        }else{
        for(int i=2;i<=Math.sqrt(n);i++){ // sqrt of n avoids repeating of multiples
            if(n%i==0){ //check is there any factors between 1 and number (n-1)
                isprime=false;
            }
        }
    }
        if(isprime==true){
            System.out.println(n+"is prime");

        }else{
            System.out.println(n +" is not a prime");
        }
        
    }
}
