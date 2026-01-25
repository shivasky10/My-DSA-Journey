package Recursion;

public class optimisedpower {

    public static int optpower(int x , int n){
        if(n==0){
            return 1; 
        }
        int half= optpower(x, n/2);
        int halfans = half * half;

        if(n%2!=0){
            halfans = x *halfans;
        }

        return halfans;
    }
    public static void main(String[] args) {
        int x =2;
        int n=10;
        System.out.println(optpower(x, n));
    }
}
