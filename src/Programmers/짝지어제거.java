package Programmers;

import java.util.HashSet;
import java.util.Set;

public class 짝지어제거 {
    public static void main(String[] args) {

        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }
    public static int solution(String s){
        int answer = -1;
        boolean change = true;
        char[] arr  = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }
        int len = s.length();
        while(change){
            len = s.length();
            for(char c : set){
                s = s.replace("["+c+"]{2}","");
                System.out.println("now : "+c+", string is : " + s);
            }
            if(len == s.length()){
                change = false;
                break;
            }
        }
        return change?1:0;
    }
}
