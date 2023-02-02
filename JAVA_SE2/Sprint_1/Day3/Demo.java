package SB_101.Sprint_1.Day3;

import java.util.function.Function;

public class Demo {
    public static  int getNumber(){
        return 1000;
    }
    public static void main(String[] args) {
      /*  Predicate<Student> p1=new MyPredicate();
        System.out.println(p1.test(new Student(10,"Debabrata",1000)));

        Predicate<Student> p2= s -> s.getMarks()>700;
        System.out.println(p2.test(new Student(10,"Debabrata",600)));
       Predicate<Integer> p3 = A::checkTheResult;
    System.out.println(p3.test(500 )); */


     /*   List<Student> students=new ArrayList<>();
        students.add(new Student(10,"N1",879));
        students.add(new Student(12,"N2",244));
        students.add(new Student(14,"N3",860));
        students.add(new Student(15,"N5",400));
        students.removeIf(student -> student.getMarks()<500);
        System.out.println(students); */

       /* Consumer<String> c1 = new MyConsumer();
        c1.accept("Ramesh");

        Consumer<String> c2 = n -> System.out.println("Welcome "+n.toLowerCase());
        c2.accept("RALAAKA");  */

        /*Consumer<Student> c1 = new MyConsumer();
        c1.accept(new Student(10,"Debabrata",450));

        Consumer<Student> c2 = s -> {
            System.out.println("Welcome : "+s.getName());
            System.out.println("Roll number : "+s.getRoll());
            System.out.println("Marks number : "+s.getMarks());
        };

        c2.accept(new Student(15,"Debabrata Satapathy",780)); */

   /*  List<String> names = Arrays.asList("Debabrata","Satyabrata","Venkat","Vinay");

     names.forEach(n-> System.out.println(n.toUpperCase()));

     names.forEach(System.out::println); */

       /* List<Student> students=new ArrayList<>();
        students.add(new Student(10,"N1",879));
        students.add(new Student(12,"N2",244));
        students.add(new Student(14,"N3",860));
        students.add(new Student(15,"N5",400));

        students.forEach(s->{
            System.out.println("Welcome : "+s.getName());
            System.out.println("Roll number : "+s.getRoll());
            System.out.println("Marks number : "+s.getMarks());
            System.out.println("==============================");
        });*/

       /* Supplier<String> stringSupplier= new MySupplier();
        System.out.println(stringSupplier.get());

        Supplier<String> s2= () -> "This message is returned from LE";
        System.out.println(s2.get());

        Supplier <Student> s3 = () -> new Student(16,"Debabrata",592);
        System.out.println(s3.get());

        Supplier<Integer> s4= Demo::getNumber;
        System.out.println(s4.get()); */

        Function<Student,String> f1= new MyFunction();
        String res = f1.apply(new Student(10,"Deba",5000));
        System.out.println(res);

         Function<Student,String> f2 = student -> student.getMarks() > 700 ? "Pass":"Fail";
        String res2 = f2.apply(new Student(10,"Deba",800));
        System.out.println(res2);

    }
}
