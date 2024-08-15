package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 주식가격 {
    public static void main(String[] args) {

        int[] s1 = solution(new int[]{1, 2, 3, 2, 3,0,2});
        int[] s2 = solution(new int[]{1, 2, 3, 2, 3});
        System.out.print("s1 : ");
        for (int i : s1) {
            System.out.print(i + " ");
        }
        System.out.print("\n s2: " );
        for (int i : s2) {
            System.out.print(i+" ") ;
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < prices.length; i++) {
            System.out.println(st);
            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                int idx = st.pop();
                answer[idx] = i - idx;
            }
            st.push(i);
        }
        int last = prices.length - 1;
        while (!st.isEmpty()) {
            int remain = st.pop();
            answer[remain] = last - remain;
        }
        return answer;
    }

}
