import java.util.*;

public class Strings {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static boolean  palindrome(String palistr){
        for(int i=0;i<palistr.length()/2;i++){
            if(palistr.charAt(i)!=palistr.charAt(palistr.length()-1-i)){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter string");
        // String name= sc.nextLine();
        // System.out.println(name.length());

        //-------concatenation--------
        // String first ="Shiva";
        // String last = "kumar";
        // String fullname = first +" "+last;
        // // System.out.println(fullname+" "+fullname.length());

        // printletters(fullname);

        String Palinstr = "heleh";
        System.out.println(palindrome(Palinstr));

    }
}
