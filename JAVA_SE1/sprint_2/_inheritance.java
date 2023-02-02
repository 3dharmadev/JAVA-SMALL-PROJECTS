package java111.sprint_2;

public class _inheritance {

    public static void main(String[] args) {
        Plant plant=new Plant();
        Cactus cactus=new Cactus();
        plant.water();
        cactus.water();
    }
}


class  Plant {
    void water(){
        System.out.println("Plant needs water");
    }
}
class Cactus extends  Plant{
     @Override
    void water(){
        System.out.println("cactus needs water occasionally");
    }
}