public class MaxOnesRow {
    public static int rowWithMaxOnes(int[][] matrix) {
        int maxRow = -1, maxCount = 0, cols = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            int count = cols - firstOneIndex(matrix[i]);
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

    private static int firstOneIndex(int[] row) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println("Row with max 1s: " + rowWithMaxOnes(matrix));
    }
}
