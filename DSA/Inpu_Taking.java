package DSA501;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

public class Inpu_Taking {


    public static void main(String[] args) throws IOException {
        String str = "idwmdggom";
        int k = 2;
        int c = 0;

       /* for (int i = 0; i <= str.length() - k; i++) {
            String substr= str.substring(i, i + k);

            Set<Character> characters=new HashSet<>();
            boolean isUnique = true;
            for (int j = 0; j < substr.length(); j++) {
                if (characters.contains(substr.charAt(j))) {
                    isUnique = false;
                    break;
                }

              characters.add(substr.charAt(j));
            }


            if (isUnique) {
                c++;
            }
        } */

    }

//
//     for(let i=0;i<n;i++){
//
//        if(stack.length>0 && stack[top]===arr2[x]){
//            stack.pop();
//            top--;
//            x++
//        }else{
//            top++;
//            stack[top]=arr1[i]
//        }
//        while(stack.length>0&&stack[top]===arr2[x]){
//            stack.pop();
//            top--;
//            x++
//        }
//
//    }

}
