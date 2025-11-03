
//Bruteforce approach

public class SubarraymaxBrute {

      public static void maxsubarraysum(int number[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;

        // int t = (number.length*(number.length+1))/2;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=number[k];
                    // System.out.print(number[k]+" ");
                }
                System.out.println(currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("total maxsubarryssum:"+maxsum);
    }

    public static void main(String[] args) {
        int number[]={12,3,4,3};
        maxsubarraysum(number);
    }
}
