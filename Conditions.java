import java.util.*;
import java.lang.*;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number =8;
        // String type = ((number%2)==0)?"even":"odd";
        // System.out.println(type);
        // System.out.println("enter your income ");
        // int income = sc.nextInt();
        // int tax;
        // if(income<=500000){
        //    tax=0;
        // }else if (income>=500000 && income <=100000){
        //     tax = (int)(income * 0.25);
        // }else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("your tax is " +tax);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);

        switch ( operator) {
            case '+':
                System.out.println(a+b);    
                break;
            case '-':
                System.out.println(a-b);
                break;
            default:
                System.out.println("invalid option");
        }
        sc.close();
    }
}
