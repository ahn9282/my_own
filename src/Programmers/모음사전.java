package Programmers;

public class 모음사전 {
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
        System.out.println(solution("I"));
        System.out.println(solution("EIO"));
    }
    public static int solution(String word) {
        int answer = 0;
        char c = word.charAt(0);
        char[] chars = {'A', 'E', 'I', 'O', 'U'};
        char[] arr = word.substring(1).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                answer += Math.pow(781, i);
                break;
            }
        }
        int len = arr.length;
          if(len <=3){
              answer += Math.pow(5, 4);
              if(len <=2){
                  answer += Math.pow(5, 3);
                  if(len <=1){
                      answer += 25;
                  }
              }
          }
        System.out.println("answer = " + answer);
        int qwe = 1;
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if(arr[i] == chars[j]){
                    qwe *= j + 1;
                }
            }
        }
        System.out.println("qwe = " + qwe);
        answer += qwe;
        return answer;
    }
}
