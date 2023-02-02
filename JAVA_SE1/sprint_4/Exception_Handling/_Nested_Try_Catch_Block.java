package java111.sprint_4.Exception_Handling;

public class _Nested_Try_Catch_Block {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int[] arr={1,2,3,4,5};
                    System.out.println(arr[10]);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("arithmatic exception");
                    System.out.println("inner catch block 2");
                }
            }
            catch (ArithmeticException arithmeticException){
                System.out.println("arithmatic exception");
                System.out.println("inner catch block 1");
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("arrayIndexOutOfBoundsException  exception");
            System.out.println("Outer(Main)  block ");
        }
        catch (Exception ex){
            System.out.println("Exception");
        }

    }

}
