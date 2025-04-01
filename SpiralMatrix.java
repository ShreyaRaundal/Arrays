import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                // Move left
                for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                // Move up
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Spiral Order: " + spiralOrder(matrix));
    }
}
