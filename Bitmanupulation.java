public class Bitmanupulation {

    public static void oddoreven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }


    public static void main(String[] args) {
        // System.out.println(5&4);
        // System.out.println(5|4);
        // System.out.println(5^4);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        oddoreven(5);
        oddoreven(8);
    }
}
