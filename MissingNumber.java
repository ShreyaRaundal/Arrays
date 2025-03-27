public class MissingNumber {
    public static int findMissing(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; 
        int N = 6;
        System.out.println("Missing number: " + findMissing(arr, N));
    }
}