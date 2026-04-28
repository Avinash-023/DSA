class Solution {
    public int minOperations(int[][] grid, int x) {
        int op=0;
        int[] arr=new int[grid.length*grid[0].length];
        int index=0;
        int rem=grid[0][0]%x;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]%x!=rem){
                    return -1;
                }
                arr[index++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int val=arr[arr.length/2];
        
        for(int i=0;i<arr.length;i++){
            op+=(Math.abs(val-arr[i])/x);
        }
        // System.out.println(Arrays.toString(arr));
        return op;

    }
}