package DSA401;


public class StringLengthUsingRecurssion {

    public static void display(int num){
        // System.out.println(Arrays.toString(arr));
        if (num>0) {
            display(num/2);
            System.out.print(num%2);
        }
    }
    public static void main(String [] args){

        display(15);

    }
}
