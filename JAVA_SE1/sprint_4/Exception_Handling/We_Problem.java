package java111.sprint_4.Exception_Handling;

public class We_Problem {
    public static void main(String[] args) {
        int[] arr= new int[5];
        try {
            System.out.println(arr[5]);
        }
       catch (ArithmeticException ex){
//           ex.printStackTrace();
           System.err.println(ex.getMessage());
       }
        finally {
            System.out.println("in finally block");
        }

    }
}
