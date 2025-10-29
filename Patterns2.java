

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
      
    public static void floyds(int n){
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void trianglebinary(int n){
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        //first half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second part inverted
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // hallow(4, 4);
        // invert_pyramid(4);
        // inverted_withnum(5);
        // floyds(5);
        // trianglebinary(5);
        butterfly(5);
    }
}
