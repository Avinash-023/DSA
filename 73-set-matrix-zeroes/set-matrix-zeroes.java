class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<int[]> zeros = new ArrayList<>();

        // Store zero positions
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    zeros.add(new int[]{i, j});
                }
            }
        }

        // Set rows and cols to zero
        for(int[] pos : zeros) {
            int r = pos[0];
            int c = pos[1];

            for(int j = 0; j < m; j++) {
                matrix[r][j] = 0;
            }

            for(int i = 0; i < n; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}