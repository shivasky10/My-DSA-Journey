
    //-----------------prefixsum approach------------------------

    public class Maxsubarraysumprefix{

        public static void prefixsum(int number[]){
            int currsum=0;
            int maxsum =Integer.MIN_VALUE;
            int prefix[]= new int[number.length];

            prefix[0]=number[0];
            for(int i=1;i<number.length;i++){
                prefix[i]=prefix[i-1]+number[i];
            }

            for(int i=0;i<number.length;i++){
                for(int j=i;j<number.length;j++){
                    currsum = i==0 ? prefix[j] : prefix[j]- prefix[i-1];

                    if(currsum >maxsum){
                    maxsum = currsum;
                    }
                }
            }

            System.out.println("total maxsubarray sum"+maxsum);

        }

        public static void main(String[] args) {
            int number[]={2,6,14,5};
            prefixsum(number);
        }
    }