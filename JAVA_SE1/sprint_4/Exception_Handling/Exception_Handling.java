package Exception_Handling;

public class Exception_Handling {
    public static void main(String[] args) {

        My_Own_Unchecked_Exception my_own_unchecked_exception=null;
       try{
           //System.out.println(my_own_unchecked_exception.hashCode());
           System.out.println(3/0);
           System.out.println();
       }
       catch (ArithmeticException exception){
           System.out.println("Catch block executed");
       }
       finally {
           System.out.println("it always executed");
       }
    }
}
class  My_Own_Unchecked_Exception extends  RuntimeException{

}