package Programmers;

public class 땅따먹기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1},{9,1,9,9}}));
    }
    static int solution(int[][] land) {
        for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }
        for (int[] ints : land) {
            System.out.print("[");
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println("]");
        }

        int answer = 0;
        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }

        return answer;
    }

}
