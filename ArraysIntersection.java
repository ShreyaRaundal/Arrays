import java.util.Arrays;

public class ArraysIntersection {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result[index++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(result, index); // Trim unused space
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 5, 6};
        System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
    }
}
