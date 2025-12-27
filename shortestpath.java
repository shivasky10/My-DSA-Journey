public class shortestpath {

    public static float shortest(String str){
        int x =0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char d=str.charAt(i);
            if(d=='N'){
                y++;
            }else if(d=='S'){
                y--;
            }else if(d=='E'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortest(str));
    }
}
