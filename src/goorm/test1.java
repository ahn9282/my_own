package goorm;

import java.io.*;
import java.lang.*;
import java.util.*;


public class test1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void testCase(int caseIndex) {
        int N = scanner.nextInt();  // 지도의 크기
        int K = scanner.nextInt();  // 놀이공원의 크기

        int[][] wastes = new int[N][N]; // 각 칸의 쓰레기 존재 여부
        for (int r = 0; r < N; r += 1) {
            for (int c = 0; c < N; c += 1) {
                wastes[r][c] = scanner.nextInt();
            }
        }



        int answer=Integer.MAX_VALUE;
        int range_=N-K+1;

        for(int i=0;i<range_;i++)
        {
            for(int j=0;j<range_;j++)
            {
                int counter=0;
                for(int x=i;x<i+K;x++)
                {
                    for(int y=j;y<j+K;y++)
                    {
                        counter+=wastes[x][y];

                    }
                }
                //System.out.println(" ");
                answer=Math.min(answer,counter);
            }
        }




        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        int caseSize = scanner.nextInt();

        for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
            testCase(caseIndex);
        }

    }

}
