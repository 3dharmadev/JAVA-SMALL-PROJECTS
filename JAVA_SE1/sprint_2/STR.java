package java111.sprint_2;

public class STR {
    public static void main(String[] args) {
        String x="hi";
        String y="hi";
        x.concat("there");
        x="hello";
        System.out.println(x);
        String editMe = "abcd...xyz";
        String new_str=editMe.replace('a','1');
        System.out.println(new_str);
    }
}
