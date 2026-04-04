class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols=encodedText.length()/rows;
        char[][] matrix=new char[rows][cols];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=encodedText.charAt(index);
                index++;
                // System.out.print(matrix[i][j]+" ");
            }
            // System.out.println();
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<cols;i++){
            int temp=i;
            for(int j=0;j<rows;j++){
                sb.append(matrix[j][temp]);
                temp++;
                if(temp==cols){
                    break;
                }
            }
        }

        return sb.toString().stripTrailing();
    }
}