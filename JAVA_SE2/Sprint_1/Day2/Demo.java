package SB_101.Sprint_1.Day2;

public class Demo {
   public   void fun1(A a1){
       System.out.println("Inside of demo 1");
       a1.funA();
   }
   public   void funX(String name){
       System.out.println("Inside funX of Demo welcome "+name);
   }
   public Demo(String a){
       System.out.println("Using constructor "+a);
   }
    public static void main(String[] args) {
/*      Demo d1=new Demo();
        d1.fun1(new A());
        List<Student> students=new ArrayList<>();
        students.add(new Student(10,"N1",879));
        students.add(new Student(12,"N2",870));
        students.add(new Student(14,"N3",860));
        students.add(new Student(15,"N5",839));
        Collections.sort(students,(Student s1,Student s2)->{
            return s1.getMarks() > s2.getMarks() ? 1:-1;
        });
        System.out.println(students); */

  Intr i1 =  name -> System.out.println("Using Lambda Expression welcome "+name);
  i1.sayHello("Debabrata");


  Intr i2 = Demo::new;
  i2.sayHello("Rameshwar");



    }
}

