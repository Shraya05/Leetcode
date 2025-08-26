class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int height[][]=new int[rows][cols];
        for(int j=0;j<cols;j++)
        {
            for(int i=0;i<rows;i++)
            {
                if(matrix[i][j]==1)
                {
                    height[i][j]=(i==0?1:height[i-1][j]+1);
                }
                else height[i][j]=0;
            }
        }
        int maxArea=0;
        for(int i=0;i<rows;i++)
        {
            int row[]=height[i].clone();
            Arrays.sort(row);
            for(int j=0;j<cols;j++)
            {
            if(row[cols-1-j]==0) break;
           
                int area=row[cols-1-j]*(j+1);
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}