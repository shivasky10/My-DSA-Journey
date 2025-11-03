public class Linearsearch {

    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }   
        }

         return -1;
    }

    public static void main(String[] args) {
        int num[]={12,4,5,2,32,54,76,87,13};
        int key =13;
        int index = linear(num, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("index is "+index);
        }
    }
}
