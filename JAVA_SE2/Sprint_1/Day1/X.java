package SB_101.Sprint_1.Day1;

public interface X {
    public int convertStringToNumber(String s);
}

class Method_Ref implements X{


    public static int sizeOfString(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        X x= Method_Ref::sizeOfString;
      int res=  x.convertStringToNumber("200");
        System.out.println(res);
    }

    @Override
    public int convertStringToNumber(String s) {
        return Integer.parseInt(s);
    }
}
