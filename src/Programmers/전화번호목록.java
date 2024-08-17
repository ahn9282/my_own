package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 전화번호목록 {
    public static void main(String[] args) {

        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));

        }

        public static boolean solution(String[] phone_book) {
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < phone_book.length; j++) {
                map.put(phone_book[j], j);
            }
            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 0; j < phone_book[i].length(); j++) {
                    if (map.containsKey(phone_book[i].substring(0, j))) {
                        return false;
                    }
                }
            }

            return true;
    }
}
