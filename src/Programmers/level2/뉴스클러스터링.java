package Programmers.level2;

import java.util.*;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int s1 = solution.solution("FRANCE", "french");
        System.out.println("s1 = " + s1);
        int s2 = solution.solution("handshake", "shake hands");
        System.out.println("s2 = " + s2);
        int s3 = solution.solution("E=M*C^2", "e=m*c^2");
        System.out.println("s3 = " + s3);
    }

    static class Solution{
        public int solution(String str1, String str2) {
            int answer = 0;
            String[] arr1 = new String[str1.length()];
            String[] arr2 = new String[str2.length()];
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();
            List<String> list1 = makeList(str1);
            List<String> list2 = makeList(str2);

            int intersection = 0;
            int union = 0;

            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            for (String s : list1) {
                map1.put(s, map1.getOrDefault(s, 0) + 1);
            }

            for (String s : list2) {
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }

            Set<String> allKeys = new HashSet<>();
            allKeys.addAll(map1.keySet());
            allKeys.addAll(map2.keySet());

            for (String key : allKeys) {
                int count1 = map1.getOrDefault(key, 0);
                int count2 = map2.getOrDefault(key, 0);

                intersection += Math.min(count1, count2);

                union += Math.max(count1, count2);
            }
            double jc = union == 0 ? 1 : (double) intersection / union;

            return (int) (jc * 65536);
        }
    }
    static private List<String> makeList(String str) {
        List<String> multiset = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String part = str.substring(i, i + 2);
            if (part.matches("[A-Z]{2}")) {
                multiset.add(part);
            }
        }
        return multiset;
    }
}
