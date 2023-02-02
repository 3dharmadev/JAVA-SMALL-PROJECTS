package java111.sprint_4.Exception_Handling.Assignment1;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        try {
            System.out.println("The quotient of " + a + " / " + b + " = " + a/b);
        }
        catch (ArithmeticException arithmeticException){

            System.out.println(arithmeticException.getMessage()+"Exception caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
        sc.close();

    }
}
/*Q2)Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program
may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In
the catch block, print the message as shown in the sample output. Also illustrate the use of finally block.
Print the message “Inside finally block”.
Sample Input and Output 1:
Enter the 2 numbers 5 2
The quotient of 5/2 = 2
Inside finally block
Sample Input and Output 2:
Enter the 2 numbers 5 0
DivideByZeroException caught
Inside finally block*/
