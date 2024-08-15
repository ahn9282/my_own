package Programmers;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,4}));
        System.out.println(solution(new int[]{5,6,7,8}));
        System.out.println(solution(new int[]{100,106,107,1}));
    }
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i]  >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
