package java111.sprint_3.inheritance_override_;

public class Instance_Of_2 {
    public static void main(String[] args) {
          Animal animal=new Animal();
          takeAnimal(animal);
          Elephant elephant=new Elephant();
          takeAnimal(elephant);
       Fish fish=new Fish();
        takeAnimal(fish);
    }

    static  void takeAnimal(Animal animal){
         animal.speak();
//      animal.swim();
        if(animal instanceof  Fish) {
            Fish f1 = (Fish) animal;

            f1.swim();
        }
    }
}

class  Animal{
    void speak(){
        System.out.println("animal speaks");
    }
}
class  Elephant extends Animal{
   void size(){
       System.out.println("Huge");
   }
}
class Fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}