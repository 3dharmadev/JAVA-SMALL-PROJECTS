package java111.sprint_1;

public class conditional_statement {
    public static void main(String[] args) {
        int DayNight=0;
        switch (DayNight){
            case 0:
                System.out.println("Day");break;
            case 1:
                System.out.println("Night"); break;
            default:
                System.out.println("Wrong input");
        }
        int i=10;
        i++; int j;
        if(i==10){
            j=20;
        }
        else {
            j=30;
        }
        System.out.println(j);
    }
}
