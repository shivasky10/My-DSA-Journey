public class Binarysearch {

    public static int binarysearch(int number[],int key){
        int start=0, end = number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                //found at mid
                return mid;
            }if(number[mid]<key){
                //right side
                start=mid+1;
            }else{
                //left side
                end=mid-1;
            }
        }

        return -1;
    }



    public static void  reverseArr(int number[]){
        int first =0,last=number.length-1;
        while(first<last){
            int temp = number[first];
            number[first]=number[last];
            number[last]=temp;

            first++;
            last--;

        }
    }

    public static void arrpairs(int number[]){
        int t=0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr +","+number[j]+")");
                t++;
            }
            System.out.println();
        }
        System.out.println("total pairs:"+t);
    }



    //subarrays

    public static void subarray(int number[]){

        int t = (number.length*(number.length+1))/2;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrys:"+t);
    }
    public static void main(String[] args) {
        int number[]={2,5,6,8,10,34,56};
        int key= 34;

        // System.out.println("At index" +binarysearch(number, key));


        // reverseArr(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i]+ " ");
        // }
        // System.out.println();


        // arrpairs(number);

        subarray(number);
    }
}
