public class Patterns {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i+1;s++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----------------------------------");
        int a=4;
        char ch='A';
        for(int line=1;line<=a;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        int no=10;
        int m=10;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==no||j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}
