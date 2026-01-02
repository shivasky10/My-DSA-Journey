

package Recursion;



public class Printnumbers {

    public static void  increasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        increasing(n-1);
        System.out.print(n+" ");
    }



    public  static void decreasing(int n){

        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        decreasing(n-1);


    }

    

    public static void main(String[] args) {
        
        int n=10;
        decreasing(n);
        increasing(n);
    }
}
