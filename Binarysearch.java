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
    public static void main(String[] args) {
        int number[]={2,5,6,8,10,34,56};
        int key= 34;

        System.out.println("At index" +binarysearch(number, key));
    }
}
