package Programmers;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {

        int[] s1 = solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        System.out.print("s1 : ");
        for (int i : s1) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] s2 = solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
        System.out.print(" s2 : ");
        for (int i2 : s2) {
            System.out.print(i2+" ");
        }
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> user = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0 ; i < id_list.length; i++) {
            user.put(id_list[i], new HashSet<>());
        }
        Set<String> set = new HashSet<>(List.of(report));
        for (String s : set) {
            String[] sr = s.split(" ");
            String a = sr[0];
            String b = sr[1];
            user.get(a).add(b);
            count.put(b, count.getOrDefault(b, 0) + 1);
        }
        int order = 0;
        for (String str : user.keySet()) {
            int notice = 0;
            for (String s : count.keySet()) {
                if (count.get(s) >= k) {
                    if(user.get(str).contains(s)) notice++;
                }
            }
            for (int i = 0; i < id_list.length; i++) {
                if(str.equals(id_list[i])){
                    answer[i] = notice;
                }
            }
            order++;
        }
        return answer;
    }
}
