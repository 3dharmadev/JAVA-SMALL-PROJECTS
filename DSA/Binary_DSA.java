package DSA401;

public class Binary_DSA {
    public static void display(int num){
        // System.out.println(Arrays.toString(arr));
         System.out.println(1%2);
        if (num>0) {
            display(num/2);
            System.out.print(num%2);
        }
    }

    public static void main(String[] args) {
        display(15);
    }
}
