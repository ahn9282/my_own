package BaekJoon.bronze;

import java.util.*;

public class Bj25206_너의평점은 {
    public static void main(String[] args) {
        Map<String, Double> grades = Map.of(
                "A+", 4.5,"A0", 4.0,"B+", 3.5,"B0", 3.0,
                "C+", 2.5,"C0", 2.0,"D+", 1.5,"D0", 1.0,"F", 0.0
        );
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
       for(int i =0 ; i < 20; i++){
                list.add(sc.nextLine().split(" "));
        }

        double count = 0;
        double sum = 0;
        for (String[] s : list) {
            if(!s[2].equals("P")){
                double score = Double.parseDouble(s[1]);
                double grade = grades.get(s[2]);
                count += score;
                sum += score * grade;
            }
        }
        double v = sum / count;
        System.out.println(Math.round(v*1000000.0)/1000000.0);
    }
}
