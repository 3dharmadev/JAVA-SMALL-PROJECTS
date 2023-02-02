package java111.sprint_3;

public class _Count_Vowel_Consonant {
    public static void return_Count(String str){
     int   count_vowel=0; int ctn_consonant=0;
     for (int i=0;i<str.length();i++){
         Character x=str.charAt(i);
         if(x.equals('a')|| x.equals('e')||x.equals('i') || x.equals('o')||x.equals('u')
           || x.equals('A')|| x.equals('E')||x.equals('I') || x.equals('O')||x.equals('U') )  count_vowel++;
         else ctn_consonant++;
     }
        System.out.println("Count of vowel in the string is "+count_vowel);
        System.out.println("Count of consonant in the String is "+ctn_consonant);
    }
    public static void main(String[] args) {
               return_Count("vowel");
    }
}
