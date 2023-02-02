package java111.sprint_2;

public class day_1_multiple_object_using_array {

    public static void main(String[] args) {
        Egg egg1 = new Egg();
        egg1.color="white";
        egg1.size =2;

        Egg egg2 = new Egg();
        egg2.color="pale";
        egg2.size =3;

        Nest nest = new Nest();
        nest.color="brown";
        nest.height=100;

        Egg[] arrayOfEggs = new Egg[2];
        arrayOfEggs[0]=egg1;
        arrayOfEggs[1]=egg2;
        nest.eggs=arrayOfEggs;
        System.out.println();

    }
}
class  Nest{
    int height;
    String color;
    Egg [] eggs;//=new Egg[2];

}

class Egg{
    String color;
    int size;
}