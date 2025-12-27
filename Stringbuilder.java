public class Stringbuilder {


    //Covert first letter in each word in string to uppercase

    public static String uppercase(String str){
        StringBuilder w = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        w.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<=str.length()-1){
                w.append(str.charAt(i));
                i++;
                w.append(Character.toUpperCase(str.charAt(i)));

            }else{
                w.append(str.charAt(i));
            }
        }

        return w.toString();
    }




    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }

        // System.out.println(sb);

        String str = "hi i am shiva kumar";
        System.out.println(uppercase(str));
    }
}


