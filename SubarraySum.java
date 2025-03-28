import java.util.Arrays;

public class SubarraySum {
    public static int[] findSubarrayWithSum(int[] arr, int targetSum) {
        int left = 0, sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > targetSum) {
                sum -= arr[left++];
            }

            if (sum == targetSum) {
                return Arrays.copyOfRange(arr, left, right + 1);
            }
        }
        return new int[]{-1}; // No subarray found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;
        System.out.println("Subarray with sum " + targetSum + ": " + Arrays.toString(findSubarrayWithSum(arr, targetSum)));
    }
}
