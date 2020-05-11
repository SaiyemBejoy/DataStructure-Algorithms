package data_structure;

import java.util.Stack;

public class StringReverser {
    public static void main(String[] args) {

        System.out.println(reverse("Md Jannatus Saiyem Bejoy"));
    }

    public static String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
