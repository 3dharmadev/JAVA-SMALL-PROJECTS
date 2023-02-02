package java111.sprint_4.Exception_Handling;

public class Finally_ {
    public static void main(String[] args) {
        try {
            int data=25/0;
            System.out.println(data);
        }
        catch (NullPointerException exception){
            System.out.println(exception);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code....");
    }
}
