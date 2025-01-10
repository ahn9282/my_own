package leetcode;

public class Leet_3 {



    public static void main(String[] args) {


        int result4 = lengthOfLongestSubstring("au");
        System.out.println("result3 = " + result4);
    }
        public static int lengthOfLongestSubstring(String s) {
            int result = 0;
            if(s.length() <=1)return s.length();
            for(int i = 0 ; i < s.length()-1; i++){
                boolean[] exist = new boolean[128];
                char start = s.charAt(i);
                int val = 0;
                for (int j = i; j < s.length(); j++) {
                    char end = s.charAt(j);
                    if(exist[end]){
                        result = Math.max(result, val);
                        break;
                    }
                        exist[end] = true;
                        val++;

                        if(j==s.length() - 1)result = Math.max(result, val);
                }
            }
            return result;
        }


}
