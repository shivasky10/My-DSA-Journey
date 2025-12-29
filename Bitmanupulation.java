public class Bitmanupulation {

    public static void oddoreven(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    //operators in bits
    //get ith bit
    public static int getith(int n , int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //count set bits ***imp
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }


    public static void main(String[] args) {
        // System.out.println(5&4);
        // System.out.println(5|4);
        // System.out.println(5^4);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(6>>1);


        // oddoreven(5);
        // oddoreven(8);

        // System.out.println(getith(10, 3));

        System.out.println(countsetbits(10));
    }
}
