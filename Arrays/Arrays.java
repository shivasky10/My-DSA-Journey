package Arrays;

import java.util.*;
public class Arrays {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }

    }
    public static void main(String[] args) {
        
        // int marks[]=new int[100];
        // //declaring size of an array
        // Scanner sc = new Scanner(System.in);

        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();

        // System.out.println("maths:"+marks[0]);
        // System.out.println("physics:"+marks[1]);

        int marks[]={98,97,95};
        update(marks);

        //here arrays is used as calllby reference so original value also changes but varibales are only call by value
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
       

    }
}
