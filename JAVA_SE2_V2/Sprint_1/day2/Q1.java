package SB101_V2.Sprint_1.day2;

public class Q1 {

    public static void main(String[] args) {
        Demo d= Integer::parseInt;

     int convertStringToNumber =   d.convertStringToNumber("100");
        System.out.println(convertStringToNumber);
    }



}
