package Programmers;



public class n제곱배열자르기 {
    public static void main(String[] args) {
        printarr(solution(3, 2, 5));
        printarr(solution(4, 7, 14));
    }
        public static int[] solution(int n, long left, long right) {
            int len = (int) (right - left) + 1;
            int[] answer = new int[len];
            System.out.println("len = " + len);
            long start = left;
            for (long i = left; i <= right; i++) {
                int base = (int)(i/n);
                int h = (int) (i % n);
                answer[(int)(i - left)] = Math.max(base,h)+1;
            }
            return answer;
        }

    public static void printarr(int[] arr) {
            System.out.print("[");
            for (int anInt : arr) {
                System.out.print(anInt + " ");
            }
            System.out.println("]");
    }
}
