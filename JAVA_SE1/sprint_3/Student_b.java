package java111.sprint_3;

import java.util.*;

public class Student_b{
    private String name;
    private int age;
    private String address;
    private String email;

    public Student_b(){}

//    public Student_b(String name, int age, String address, String email){
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.email = email;
//    }

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        sc.nextLine();



        Student_b[] s= new Student_b[size];

        for(int i = 0; i < size; i++){
            s[i]=new Student_b();
            System.out.print("Name: ");
            String Name = sc.nextLine();
            s[i].setName(Name);
            System.out.print("Age: ");
            int Age = sc.nextInt();
            s[i].setAge(Age);
            System.out.print("Address: ");
            sc.nextLine();
            String Address = sc.nextLine();
            s[i].setAddress(Address);
            System.out.print("Email: ");
            String Email = sc.nextLine();
            s[i].setEmail(Email);

        }


      for(int i=0;i<s.length;i++){
          int age=s[i].getAge();
           String address=  s[i].getAddress();
          String Name=   s[i].getName();
          String email=s[i].getEmail();
          System.out.println(address+" "+age+" "+Name+" "+email);

      }

    }
}

