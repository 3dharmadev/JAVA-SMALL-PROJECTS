package SB_101.Sprint_1.Day1;

import java.util.ArrayList;
import java.util.List;

public interface PrintList {
    abstract void display(List<String> city);
}


class IntrImpl implements  PrintList{

    @Override
    public void display(List<String> city) {


    }

    public static void main(String[] args) {
        List<String> city=new ArrayList<>();
        city= new ArrayList<>();
        city.add("cuttack");
        city.add("bhubaneswar");
        city.add("puri");
        city.add("Delhi");

        PrintList printList = (c) -> System.out.println(c);
        printList.display(city);
    }
}