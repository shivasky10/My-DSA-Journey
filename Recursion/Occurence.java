package Recursion;

public class Occurence {


    public static int firstoccurence(int arr[],int key,int i){

        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstoccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,2,5,7,3,5};
        System.out.println(firstoccurence(arr, 5,0 ));
    }
}
