import java.util.Stack;

public class BalancedBracketChecker {

    public static int balancedBracketChecker(String str) {
        // Use a stack to keep track of open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                // If an open bracket is encountered, push it onto the stack
                stack.push(ch);
            } else if (ch == ')') {
                // If a closing bracket is encountered, check if there is a corresponding open bracket on the stack
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Matched pair found, pop the open bracket from the stack
                } else {
                    return 0; // Unmatched closing bracket found
                }
            }
            // Ignore other characters
        }

        // Check if the stack is empty, meaning all open brackets were matched
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        String input1 = "(coder)(byte))";
        String input2 = "(c(oder)) b(yte)";

        System.out.println(balancedBracketChecker(input1)); // Output: 0
        System.out.println(balancedBracketChecker(input2)); // Output: 1
    }
}
