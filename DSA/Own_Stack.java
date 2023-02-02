package DSA301;

public class Own_Stack {
    public static void main(String[] args) {
        Stack stack=new Stack(3);
        stack.push(5);
        stack.push(15);
        stack.pop();
        stack.pop();

        stack.push(-1);
        stack.push(12);
       // System.out.println(stack[0]);
    }
}
