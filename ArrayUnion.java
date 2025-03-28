import java.util.Arrays;
public class ArrayUnion {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                result[index++] = arr2[j++];
            } else { // Equal elements
                result[index++] = arr1[i++];
                j++;
            }
        }

        while (i < arr1.length) result[index++] = arr1[i++];
        while (j < arr2.length) result[index++] = arr2[j++];

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7};
        System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));
    }
}
