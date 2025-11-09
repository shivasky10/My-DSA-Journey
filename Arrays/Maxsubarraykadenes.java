package Arrays;
//using kadenes algorithm where -ve cs no's are changes to 0;


public class Maxsubarraykadenes {
    public static void kadenes(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int n=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]<0){
                n=Math.min(number[i],n);
            }
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            //if cs is -ve we make it 0;
            ms=Math.max(cs, ms);
            //compares currsum and maxsum finds max and assigns to ms(maxsum);
        }

        System.out.println("maxsubarray sum is :"+ms);
        System.out.println("smallest negative :"+n);
    }
    public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        kadenes(number);
    }
}
