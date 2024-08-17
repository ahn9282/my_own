package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 여행경로 {
    static String[][] arr;
    public static void main(String[] args) {
        String[] s1 = solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        String[] s2 = solution(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"},{"ATL", "ICN"},{"ATL","SFO"}});
        String[] s3 = solution(new String[][]{{"ICN", "AAA"}, {"AAA", "ICN"}, {"ICN", "CCC"},{"CCC", "ICN"},{"ICN", "DDD"},{"DDD", "AAA"}});

    }
    public static String[] solution(String[][] tickets) {
        List<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        boolean[] already = new boolean[tickets.length];
        q.add("ICN");
        while (!q.isEmpty()) {
            String str = q.poll();
            list.add(str);
            String as = "";
            int dup = -1;
            for (int i = 0; i < tickets.length; i++) {
                if (already[i]) continue;
                if (str.equals(tickets[i][0])) {
                    if(!as.isEmpty()){
                        if (tickets[i][1].compareTo(as) < 0) {
                            as = tickets[i][1];
                            dup = i;
                        }
                    }else{
                        as = tickets[i][1];
                        dup = i;
                    }
                }
            }

            if (dup != -1) {
                q.add(tickets[dup][1]);
                already[dup] = true;
            }
        }
        System.out.println(String.join(" ", list));
        return list.stream().toArray(String[]::new);
    }

}
