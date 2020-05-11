package data_structure;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionValidator {

    private static final List<Character> rightBrackets = Arrays.asList(')', '>', '}', ']');
    private static final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');

    public static void main(String[] args) {

        String str = "( 1+2 )";
        boolean result = isBalanced(str);
        System.out.println(result);
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)) {
                if (stack.isEmpty())
                    return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private static boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private static boolean bracketsMatch(char left, char right) {
        return rightBrackets.indexOf(right) == leftBrackets.indexOf(left);
    }
}
