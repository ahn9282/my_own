package swea.d4;

import java.io.*;
import java.util.*;
public class S_22043_유한소수의곱셈 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i  = 0 ; i < N; i++ ){
            int len =  Integer.parseInt(br.readLine());
            int count = 0;
            Set<Double> set = new TreeSet<>();
            Set<Double> set2 = new TreeSet<>();

            for (int j = 0; j < len; j++) {
                double now =  Double.parseDouble(br.readLine());
                if(Math.round(now) == now){
                    set.add(now);
                }else{
                    set2.add(now);
                }
            }
            if(set.size() == len){
                System.out.println(len);
                continue;
            }
            for (Double d : set2) {
                for (Double v : set) {
                    double now = d * v;
                    if (Math.round(now) == now) {
                        count++;
                    }
                }
            }
            count += set.size();
            System.out.println(count);
        }
    }
}

