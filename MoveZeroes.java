import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroesToEnd(int[] arr) {
        int j = 0; // Pointer for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with zero position
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}
