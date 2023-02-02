package java111.sprint_3.generics;


import java.util.*;

public class _generics {
    public static void main(String[] args) {
       /* List strings = new ArrayList();
        strings.add("a");
        strings.add(1);

        List<String> stringlist = new ArrayList<>();
        stringlist.add("a");

        System.out.println(stringlist);*/
        //Generic type
      OurOwnGenericClass<String> ourOwnGenericClass = new OurOwnGenericClass<>();
      ourOwnGenericClass.add("abc");
        System.out.println(ourOwnGenericClass.get());
      ourOwnGenericClass.add("pqr");
        System.out.println(ourOwnGenericClass.get());
        //Non generic type
        OurOwnGenericClass nonGenericObj = new OurOwnGenericClass();
        nonGenericObj.add("Debabrata");
        String str = (String)  nonGenericObj.get();
        System.out.println(str);
        nonGenericObj.add(112);
        Integer i = (Integer) nonGenericObj.get();
        System.out.println(i);
    }
}
class  OurOwnGenericClass<T>{
    T object;
    void add(T tObject){
        object=tObject;
    }
    T get(){
        return  object;
    }
}