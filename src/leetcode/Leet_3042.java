package leetcode;

public class Leet_3042 {

    public static int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for(int i = 0; i <words.length - 1; i++){
            for(int j = i+1; j <words.length; j++){
                if(i == j) continue;
                if (words[j].contains(words[i])) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int result1 = countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"});
        int result2 = countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"});
        int result3 = countPrefixSuffixPairs(new String[]{"abab","ab"});
        int result4 = countPrefixSuffixPairs(new String[]{"a","abb"});
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
