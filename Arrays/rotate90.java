import java.util.Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                rotated[col][n - 1 - row] = matrix[row][col];
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = rotated[row][col];
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Solution sol = new Solution();
        sol.rotate(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
