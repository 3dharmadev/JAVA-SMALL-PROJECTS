package DSA401;

import java.util.ArrayList;
import java.util.List;

public class Number_Of_Way_To_Generate_String {
    public static List<String> disp(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        String[] dict =  {"1" ,"0" , "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"  };
        List<String> list = new ArrayList<>();
        backtrack(list, digits.toCharArray(), "", dict);
        return list;
    }

    public  static void backtrack(List<String> combos, char[] digits, String s, String[] dict) {
        if (s.length() == digits.length) { combos.add(s); return; }
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : dict[digit].toCharArray()) {
            backtrack(combos, digits, s + Character.toString(letter), dict);
        }
    }
    public static void main(String[] args) {
     List<String>  list =  disp("23");
        System.out.println(list);
    }
}
