package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S_1240_단순2진암호코드 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= test_case; i++) {

            st = new StringTokenizer(br.readLine());
            int Y = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            List<int[]> codeList = new ArrayList<>();

            for (int y = 0; y < Y; y++) {

                String str = br.readLine();

                for (int x = str.length() - 1; x >= 55; x--) {
                    if (codeList.isEmpty()) {
                        if (str.charAt(x) == '1') {
                            String code = str.substring(x - 55, x + 1);

                            int[] codeNumbers = new int[8];
                            for (int j = 0; j < 8; j++) {
                                String codeBinary = code.substring(j * 7, (j + 1) * 7);
                                codeNumbers[j] = convertBinaryToInt(codeBinary);
                            }

                            codeList.add(codeNumbers);
                            break;
                        }
                    }
                }

            }
            int odd = 0;
            int even = 0;
            for (int j = 0; j < codeList.get(0).length; j++) {
                int value = codeList.getFirst()[j];
                if(j % 2 ==0){
                    odd += value;
                }else{
                    even += value;
                }
            }
            int encodeValue = odd * 3 + even;
            int answer = 0;
            if(encodeValue % 10 == 0){
                for (int num : codeList.getFirst()) {
                    answer += num;
                }
            }
            System.out.println("#" + i + " " + answer);

        }
    }

    static int convertBinaryToInt(String codeBinary) {
        switch (codeBinary) {
            case "0001101":
                return 0;
            case "0011001":
                return 1;
            case "0010011":
                return 2;
            case "0111101":
                return 3;
            case "0100011":
                return 4;
            case "0110001":
                return 5;
            case "0101111":
                return 6;
            case "0111011":
                return 7;
            case "0110111":
                return 8;
            case "0001011":
                return 9;
            default:
                return -1; // 오류 처리
        }
    }
}
