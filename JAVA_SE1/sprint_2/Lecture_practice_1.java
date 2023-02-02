package java111.sprint_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_practice_1 {
    public static void main(String[] args) {

//        StringBuilder builder=new StringBuilder("this is string builder");
//        builder.append("some aja");
//        System.out.println(builder.toString());
//
//      String x="abc";
//      String y="abc";
//        System.out.println(x.compareTo(y));

        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String []  new_str=str.split(" ");
        int[] array = new int[new_str.length];
        System.out.println(Arrays.toString(new_str));


    }
}
