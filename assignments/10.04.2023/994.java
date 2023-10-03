class Solution {
    public int orangesRotting(int[][] grid) {
     int len1 = grid.length;
     int len2 = grid[0].length;

     int min = 2;
        for (int i = 0; i<len1;i++) {
            for (int j = 0; j<len2;j++) {
                if (grid[i][j] == 2) {
                    func1(i,j,grid,2);
                }
            }
        }
         for (int i = 0; i<len1;i++) {
             for (int j = 0; j<len2; j++) {
                 if (grid[i][j] == 1) {
                     return -1;
                 }
                 min = Math.max(min,grid[i][j]);
             }
        }
        return min - 2;
    }
    private void func1(int i, int j, int[][] grid, int k) {
        int cnt = 0;
        int len1 = grid.length;
        int len2 = grid[0].length;

        if (j<0||i<0||i>=len1||j>=len2||grid[i][j]==0||grid[i][j] > 1 && grid[i][j] < k) {
            return;
        }
        grid[i][j] = k;
        func1(i+1,j,grid,k+1);
        func1(i-1,j,grid,k+1);
        func1(i,j+1,grid,k+1);
        func1(i,j-1,grid,k+1);
    }
}