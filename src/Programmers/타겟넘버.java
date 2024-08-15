package Programmers;



public class 타겟넘버 {
    public static int answer;
    public static void main(String[] args) {
        int test1 = test(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(test1);
    }
    public static int test(int[] numbers, int target) {
        answer = 0;
        recur(numbers, 0, 0, target);
        return answer;
    }
    public static void recur(int[] arr, int index, int result, int target ) {
        if(index == arr.length ) {
            if(result == target)answer++;
            return;
        }
        recur(arr, index + 1, result + arr[index], target);
        recur(arr, index + 1, result - arr[index], target);
    }
}
