package java111.sprint_2;
import java.lang.*;
import java.util.StringJoiner;

public class Bank {


    // Driver code
    public static void main(String[] args) {
        /*  Character ch1 = 'X';
            Character ch2 = 'Y';
            Character ch3 = 'X';
            System.out.println(ch1.equals(ch2));
            System.out.println(ch2.equals(ch3));
            System.out.println(ch1.equals(ch3)); */

////        String s = "    Hi   ";
////        System.out.println(s.trim());
////        String a = "this time a bigger one";
////        System.out.println(a.replace('t', 'T'));
////
////        System.out.println(a.toUpperCase());
////        System.out.println(a.toLowerCase());
////
////        String subStringOfA = a.substring(12);
////        System.out.println(subStringOfA);
////        System.out.println(a.substring(5, 9));
////        System.out.println(a.indexOf('t'));
////        System.out.println(a.lastIndexOf('t'));
////        System.out.println(a.charAt(12));
////        System.out.println(a.contains("a"));
//             String abc="ajdee";
//        Character x=abc.charAt(3);
//        Character y=abc.charAt(4);
//        System.out.println(x.equals(y));

      String a ="aabcc";
        StringBuilder s = new StringBuilder("");
        int count=1; String st="";
        for(int i=0;i<a.length()-1;i++){
            Character x=a.charAt(i);
            Character y=a.charAt(i+1);
            if(x.equals(y)){
                count++;
            }
            else{
                st+=a.charAt(i)+""+count;
//              s.concat(st);
                count=1;
            }

        }
        System.out.println(s);

       // String password = "@#$*";
//            Character x= str.charAt(1);
        //boolean aa = x.equals('#');
           /* for(int i=0;i<password.length();i++){
                Character x=password.charAt(i);
                if( x.equals('#')|| x.equals('@') ||
                        x.equals('$') || x.equals('&') || x.equals('*') ) System.out.println("true");
            }
            System.out.println("false");
        }
//            */
//      boolean b= checkLowerCase("@");
//        System.out.println(b);

    }

//   static boolean checkLowerCase(String password){
//       for(int i=0;i<password.length();i++){
//           Character x=password.charAt(i);
//           if( x.equals('#')|| x.equals('@') ||
//                   x.equals('$') || x.equals('&') || x.equals('*') ) return true;
//       }
//       return false;
//       }

}

