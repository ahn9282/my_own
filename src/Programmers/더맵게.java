package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] rq, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i : rq) {
            que.add(i);
        }
        int min = que.peek();
        while (min < K) {
            if (que.size() < K) {
                que.add(que.poll() + 2 * que.poll());
                min = que.peek();
                answer++;
            } else {
                return -1;
            }
        }
        return answer;
    }
}
