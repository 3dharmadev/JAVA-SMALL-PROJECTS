package java111.sprint_3;

import java.util.Scanner;

class reversestr{
    public static String reversString(String input){
//write the logic
        StringBuilder st = new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){
            st.append(input.charAt(i));
        }


        return st.toString();


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}
