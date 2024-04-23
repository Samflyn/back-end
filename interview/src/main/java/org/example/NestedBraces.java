package org.example;

import java.util.Stack;

public class NestedBraces {

    public static String validateAndRemoveNestedGroup(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty() || !isMatching(stack.peek(), ch)) {
                    return str; // Invalid brace order
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return str; // Unclosed braces
        }

        // Remove the first nested subgroup
        int start = 0, end = 0;
        int count = 0;
        char openingBrace = ' ';
        for (int i = 1; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{') {
                count++;
                if (count == 1) {
                    start = i;
                    openingBrace = ch;
                }
            } else if (ch == ')' || ch == '}') {
                count--;
                if (count == 0 && isMatching(openingBrace, ch)) {
                    end = i + 1;
                    break;
                }
            }
        }
        return str.substring(0, start) + str.substring(end);
    }

    private static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')') || (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        String str = "{{()}(){}}";
        String modifiedString = validateAndRemoveNestedGroup(str);
        System.out.println(modifiedString);  // Output: "{(){}}"

        String str2 = "{(())}";
        modifiedString = validateAndRemoveNestedGroup(str2);
        System.out.println(modifiedString);  // Output: "{}"
    }
}
