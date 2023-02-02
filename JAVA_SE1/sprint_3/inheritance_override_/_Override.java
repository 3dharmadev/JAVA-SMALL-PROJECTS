package java111.sprint_3.inheritance_override_;

public class _Override {
    public static void main(String[] args) {
        SBI s=new SBI();
        System.out.println(s.getRateOfInterest());
        ICICI i=new ICICI();
        System.out.println(i.getRateOfInterest());
    }
}
class Bank{

    int getRateOfInterest(){
        return  0;
    }
}

class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
class ICICI extends Bank{
    @Override
    int getRateOfInterest() {
        return  7;
    }
}
