package DSA301;

public class New__ {
    public static void main(String[] args) {
           tiger tiger=new tiger();
        shark shark=new shark();
        eagle eagle=new eagle();
        deer deer=new deer();
        bear bear=new bear();


    }
}
/*
* * You are given an interface animal_kingdom, which has the following functions
1. walk() - This function should return true or false, if the animal can walk or not
2. fly() - This function should return true or false, if the animal can fly or not
3. crawl() - This function should return true or false, if the animal can crawl or not
4. run() - This function should return true or false, if the animal can run or not
5. swim() - This function should return true or false, if the animal can swim or not
There's another interface,type_of_animal, which has the following functions
1. herbivorous() - This function should return true or false, if the animal is herbivorous or not
2. carnivorous() - This function should return true or false, if the animal is carnivorous or not
3. omnivorous() - This function should return true or false, if the animal is omnivorous or not*/
interface animal_kingdom{
    public boolean walk();
    public boolean fly();
    public boolean crawl();
    public boolean run();
    public boolean swim();
}
interface type_of_animal{
    public boolean herbivorous();
    public boolean carnivorous();
    public boolean omnivorous();
}


/*
You have to implement the following classes, which implement the above two interfaces
1. tiger - Tiger can walk, run, swim,, but cannot crawl or fly, and are carnivorous
*/

class tiger implements animal_kingdom,type_of_animal{

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean crawl() {
        return false;
    }

    @Override
    public boolean run() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean herbivorous() {
        return false;
    }

    @Override
    public boolean carnivorous() {
        return true;
    }

    @Override
    public boolean omnivorous() {
        return false;
    }
}
/*
* 2. shark - Shark can swim, but cannot walk, fly, crawl or run and are carnivorous*/
class shark implements animal_kingdom,type_of_animal{

    @Override
    public boolean walk() {
        return false;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean crawl() {
        return false;
    }

    @Override
    public boolean run() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean herbivorous() {
        return false;
    }

    @Override
    public boolean carnivorous() {
        return true;
    }

    @Override
    public boolean omnivorous() {
        return false;
    }
}

/*3. eagle - Eagle can walk, fly, and swim, but cannot run or crawl, and carnivorous*/
class eagle implements animal_kingdom,type_of_animal{

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean crawl() {
        return false;
    }

    @Override
    public boolean run() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean herbivorous() {
        return false;
    }

    @Override
    public boolean carnivorous() {
        return true;
    }

    @Override
    public boolean omnivorous() {
        return false;
    }
}
//4. deer - Deer can walk, run and swim, but cannot crawl or fly, and are herbivorous
class deer implements animal_kingdom,type_of_animal{

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean crawl() {
        return false;
    }

    @Override
    public boolean run() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean herbivorous() {
        return true;
    }

    @Override
    public boolean carnivorous() {
        return false;
    }

    @Override
    public boolean omnivorous() {
        return false;
    }
}
//5. bear - Bear can walk, run and swim, but they cannot fly, crawl, and are omnivorous
class bear implements animal_kingdom,type_of_animal{

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean crawl() {
        return false;
    }

    @Override
    public boolean run() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public boolean herbivorous() {
        return false;
    }

    @Override
    public boolean carnivorous() {
        return false;
    }

    @Override
    public boolean omnivorous() {
        return true;
    }
}
