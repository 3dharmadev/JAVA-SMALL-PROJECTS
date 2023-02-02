package java111.sprint_4.Exception_Handling;

public class Multi_Catch {
    public static void main(String[] args) {
        try{
            Object obj=null;
            System.out.println(obj.toString());
            int[] a = new int[5];
            a[6]=30/0;
            System.out.println("End of the try");
        }
        catch (ArithmeticException arithmeticException){
            System.err.println("This one is arithmetic exception ");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.err.println("arrayIndexOutOfBoundsException");
        }
        catch (Exception exception){
            System.out.println("Generic  exception");
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("this is rest of the code");
    }
}
