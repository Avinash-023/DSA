class Solution {
    public void rotate(int[][] matrix) {
        int[][] dummy=new int[matrix.length][matrix[0].length];
        int n=matrix.length;
        int m=matrix[0].length;
        int x=0;
        for(int j=m-1;j>=0;j--){
            int k=0;
            for(int i=0;i<n;i++){
                dummy[i][j]=matrix[x][k];
                k++;
            }
            x++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=dummy[i][j];
            }
        }
    }
}