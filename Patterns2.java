

public class Patterns2 {
    public static void hallow(int rows , int cols){
        //Hallow reactangle

        // *****
        // *   *
        // *   *
        // *****
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }


    public static void invert_pyramid(int n){
    //     *
    //    **
    //   ***
    //  ****
    // *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_withnum(int n){
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
   
        hallow(4, 4);
        invert_pyramid(4);
        inverted_withnum(5);
    }
}
