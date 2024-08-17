package Programmers;

import java.util.Stack;

public class 택배상자 {
    public static void main(String[] args) {

        System.out.println("s1 : " + solution(new int[]{4, 3, 1, 2, 5}));
        System.out.println("s2 : " + solution(new int[]{5, 4, 3, 2, 1}));
    }
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int now =0;
        for (int i = 0; i < order.length; i++) {
            if (i +1== order[now]) {
                answer++;
                now++;
            } else if (!st.isEmpty() && st.peek() == order[now]) {
                st.pop();
                answer++;
                now++;
                i--;
            }else{
                st.add(i+1);
            }
        }
        System.out.println(st);
        while (!st.isEmpty()) {
            int remain = st.pop();
            if (remain == order[now]) {
                answer++;
                now++;
            }else{
                break;
            }
        }
        return answer;
    }
}
