package Programmers.level2;

import java.util.*;


public class 순위검색2 {
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
    static HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
    static ArrayList<Integer> score = new ArrayList<>();
    public static int[] solution(String[] info, String[] query) {
        int[] answer = {};

        //모든 경우의 해시맵 만들기
        for (String i : info) {
            dfs(0, "", i.split(" "));
        }

        //해시맵의 리스트들을 정렬
        for (ArrayList<Integer> list : hashMap.values()) {
            Collections.sort(list);
        }

        answer = new int[query.length];
        int i = 0; //쿼리반복횟수 및 answer[i]
        for (String q : query) {
            String[] data = q.split(" and ");

            String[] s = data[3].split(" ");
            int target = Integer.parseInt(s[1]); //찾아야할 값
            data[3] = s[0];

            String key = String.join("", data);

            if (hashMap.containsKey(key)) {
                ArrayList<Integer> list = hashMap.get(key);
                int start = 0;
                int end = list.size() - 1;

                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (list.get(mid) < target) {
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
                answer[i] = list.size() - start;
            }
            i++;
        }
        return answer;
    }

    static void dfs(int depth, String query, String[] info) {
        if(depth == 4){
            if (!hashMap.containsKey(query)) {
                score = new ArrayList<>();
                score.add(Integer.parseInt(info[4]));
                hashMap.put(query, score);
            }else{
                hashMap.get(query).add(Integer.parseInt(info[4]));
            }
            return;
        }

        dfs(depth + 1, query + "-", info);
        dfs(depth + 1, query + info[depth], info);
    }
}
