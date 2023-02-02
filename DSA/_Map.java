package DSA301;

import java.util.HashMap;

public class _Map {
    public static void main(String[] args) {

        System.out.println(countConsonants("pppp", "ppppo"));
        String a="aaa";
        String n="aaa";
        System.out.println(a.equals(n));
        System.out.println();

    }


    public static int countConsonants(String a,String b){
        // This function returns the length of the string having lesser number of consonants
        // In case both the strings have the same number of consonants, return the length of the bigger string
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < a.length(); i++) {
            Character x = a.charAt(i);

            if ("a".equals(x) || "e".equals(x) || "i".equals(x) ||  "o".equals(x)  ||  "u".equals(x)) {
               continue;
            }
            else count1++;
        }

        for (int j = 0; j < b.length(); j++) {
            Character x = b.charAt(j);

            if ("a".equals(x) || "e".equals(x) || "i".equals(x) ||  "o".equals(x)  ||  "u".equals(x))  {
              continue;
            }
            else count2++;
        }

        System.out.println(count1);
        System.out.println(count2);

        if (count1 < count2){
            return a.length();
        } else if (count1 > count2) {
            return b.length();
        } else  {
            if (a.length() < b.length()) return b.length();
            else return a.length();
        }
    }

}