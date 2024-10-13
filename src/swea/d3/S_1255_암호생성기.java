package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S_1255_암호생성기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb;
        int iter = 2;

        for (int i = 1; i <= iter; i++) {

            sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Queue<Integer> que = new LinkedList<>();

            for (int j = 0; j < 8; j++) {
                int i1 = Integer.parseInt(st.nextToken());
                que.add(i1);
            }
            decode(que);
            int range = que.size();
            sb.append("#" + N);
            for (int j = 0; j < range; j++) {
                sb.append(" " + que.poll());
            }
            System.out.print(sb.toString());
        }
    }

    static void decode(Queue<Integer> que) {
        boolean go = true;
        int count = 1;
        while (go) {
            if (count > 5) count = 1;
            int value = que.poll();

            int code = value - count;
            if (code <= 0) {
                go = false;
                code = 0;
            }
            que.add(code);
            count++;

        }
    }

}
