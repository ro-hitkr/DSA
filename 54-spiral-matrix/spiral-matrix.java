class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return arr;
        }

        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (stRow <= endRow && stCol <= endCol) {
            // top (left to right)
            for (int i = stCol; i <= endCol; i++) {
                arr.add(matrix[stRow][i]);
            }

            // right (top + 1 to bottom)
            for (int j = stRow + 1; j <= endRow; j++) {
                arr.add(matrix[j][endCol]);
            }

            // bottom (right - 1 down to left)
            if (stRow < endRow) {
                for (int i = endCol - 1; i >= stCol; i--) {
                    arr.add(matrix[endRow][i]);
                }
            }

            // left (bottom - 1 up to top + 1)
            if (stCol < endCol) {
                for (int j = endRow - 1; j >= stRow + 1; j--) {
                    arr.add(matrix[j][stCol]);
                }
            }

            stRow++;
            stCol++;
            endRow--;
            endCol--;
        }

        return arr;
    }
}