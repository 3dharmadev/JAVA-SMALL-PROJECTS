package java111.sprint_2;

public class day1_method_return_type {
    static void printAppleDetials(Apple apple){
        System.out.println(apple.color+" "+apple.size);
    }
    static Apple returnAppleObj(){
        Apple apple = new Apple();

        return apple;

    }
    public static void main(String[] args) {
//        int total=sum(15,20);
//        System.out.println(total);

        Apple apple=new Apple();
        apple.size=10;
        apple.color="red";
        printAppleDetials(apple);
        Apple emptyApple = new Apple();
        printAppleDetials(emptyApple);

       Apple appleCreated = returnAppleObj();
        System.out.println(appleCreated);

    }
//    public static  int sum(int x,int y){
//        return x+y;
//    }
}

class  Apple{
    int size;
    String color;
}