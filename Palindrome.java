
import java.util.Scanner;

public class Palindrome {
    
    public static boolean Palind(int number){
        int Palindrome = number;
        int reverse = 0;
        while(Palindrome!=0){
            int remainder = Palindrome % 10 ;
            reverse = reverse * 10 + remainder;
            Palindrome = Palindrome /10;
        }
        if ( number == reverse){
            return  true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(Palind(num)){
            System.out.println("number is a plaindrome");
        }else{
            System.out.println("not a plaindrome");
        }
    }
}
