package Programmers;

import java.util.*;

public class 괄호회전 {
    public static void main(String[] args) {

        System.out.println(solution(	"}]()[{"	));


    }
    public static int solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            if (process(str)) {
                count++;
            }
        }

        return count;
    }

    private static boolean process(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
