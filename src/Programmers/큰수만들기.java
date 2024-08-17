package Programmers;

import java.util.Arrays;

public class 큰수만들기 {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
        System.out.println(solution("1231234", 3));
        System.out.println(solution("4177252841", 4));

    }

    public static String solution(String number, int k) {
        int count = number.length() - k;
        StringBuilder sb = new StringBuilder();
        char[] charArray = number.toCharArray();
        for (int i = 0; i < count; i++) {

        }
        return "";
    }


}
