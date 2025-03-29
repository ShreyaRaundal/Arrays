import java.util.Arrays;

public class PrefixSumArray {
    public static int[] getPrefixSumArray(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixArr = getPrefixSumArray(arr);
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefixArr));
    }
}
