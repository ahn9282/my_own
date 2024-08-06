package Programmers;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{70, 50, 80, 50};
        System.out.println(solution(arr1, 100));
        int[] arr2 = new int[]{70, 50, 80};
        System.out.println(solution(arr2, 100));
        int[] arr3 = new int[]{10, 30, 40, 40, 70, 50, 80};
        System.out.println(solution(arr3, 100));
    }

    public static int solution(int[] people, int limit) {

        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }
}
