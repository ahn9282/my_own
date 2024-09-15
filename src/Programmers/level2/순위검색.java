package Programmers.level2;

import java.util.*;


public class 순위검색 {
    public static void main(String[] args) {
        String[] query = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        String[] info = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        int[] solution = solution(info, query);
        System.out.print("answer : ");
        for (int i : solution) {
            System.out.print( i+ " ");
        }
        System.out.println();

    }

    public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];

        List< String[]> list = new ArrayList<>(info.length);
        for (String s : info) {
            list.add(s.split(" "));
        }
        for (int i = 0; i < query.length; i++) {
            String[] arr = query[i].replace(" and ", " ").split(" ");
            int baseScore = Integer.parseInt(arr[4]);
            int num = 0;

            for (String[] str : list) {
                if (!arr[0].equals("-")&&!str[0].equals(arr[0]))  continue;
                if ( !arr[1].equals("-") &&!str[1].equals(arr[1]) ) continue;
                if ( !arr[2].equals("-")&& !str[2].equals(arr[2]) )continue;
                if ( ! arr[3].equals("-") &&  !str[3].equals(arr[3]) ) continue;
                if(!str[4].equals("-")) {
                    int score = Integer.parseInt(str[4]);
                    if (score < baseScore) continue;
                }
                num++;
            }
            answer[i] = num;
        }
        return answer;
    }

}
