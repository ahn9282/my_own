package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class S_View {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        int testCaseNumber = 1;

        for (int t = 0; t < 10; t++) {
            int buildingCount = Integer.parseInt(reader.readLine());
            tokenizer = new StringTokenizer(reader.readLine());
            int[] heights = new int[buildingCount];
            int viewableCount = 0;

            for (int i = 0; i < buildingCount; i++) {
                heights[i] = Integer.parseInt(tokenizer.nextToken());
            }

            for (int i = 2; i < buildingCount - 2; i++) {
                int currentHeight = heights[i];
                int leftMax = Math.max(heights[i - 1], heights[i - 2]);
                int rightMax = Math.max(heights[i + 1], heights[i + 2]);

                if (currentHeight > leftMax && currentHeight > rightMax) {
                    viewableCount += (currentHeight - Math.max(leftMax, rightMax));
                }
            }

            System.out.println("#" + testCaseNumber + " " + viewableCount);
            testCaseNumber++;
        }
        }
    }
