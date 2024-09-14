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
        for (int i =0; i < info.length; i++) {
            String[] split = info[i].split(" ");
            list.add(split);
        }
        for (int i = 0; i < query.length; i++) {
            String s = query[i];
            String[] arr = s.split(" and ");

            int num = 0;

            for (String[] str : list) {


                if (!arr[0].equals("-")&&!str[0].equals(arr[0]))  continue;
                if ( !arr[1].equals("-") &&!str[1].equals(arr[1]) ) continue;
                if ( !arr[2].equals("-")&& !str[2].equals(arr[2]) )continue;
                String[] split = arr[3].split(" ");
                if ( ! split[0].equals("-") &&  !str[3].equals(split[0]) ) continue;
                if(!split[1].equals("-")) {
                    int a = Integer.parseInt(str[4]);
                    int b = Integer.parseInt(split[1]);
                    if (a < b) continue;
                }
                num++;
            }
            answer[i] = num;
        }
        return answer;
    }

}
