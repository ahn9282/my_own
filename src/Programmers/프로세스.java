package Programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로세스 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            q.add(i);
        }
        System.out.println(q);
        while(!q.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                    q.poll();
                    answer++;
                    if(i == location) return answer;
                }
            }
        }
        return answer;
    }
}
