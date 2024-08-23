package Programmers;

import java.util.*;

public class 귤고르기 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
        System.out.println(solution(1, new int[]{1}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> m=new HashMap<>();

        for(int t:tangerine){
            m.put(t,m.getOrDefault(t, 0)+1);
        }
        List<Integer> list=new ArrayList<>(m.values());
        Collections.sort(list, Collections.reverseOrder());
        for (int i : list) {
            k -=i;
            answer++;
            if(k <=0) return answer;
        }
        return answer;
    }
}
