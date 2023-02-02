package java111.sprint_3;
import  java.lang.*;

public class Command_line_args {
    public static void main(String[] args) {
        int factorial=1;
        int k=Integer.parseInt(args[0]);

        for (int i=1;i<=k;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
