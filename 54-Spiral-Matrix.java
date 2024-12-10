class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
          List<Integer> li=new ArrayList<>();
          int rowend=nums.length-1;
          int colend=nums[0].length-1;
          int rowbegin=0;
          int colbegin=0;
        
            while(rowbegin<=rowend && colbegin<=colend)
            {
            for(int i=colbegin;i<=colend;i++)
            {
               li.add(nums[rowbegin][i]); 
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++)
            {
                li.add(nums[i][colend]);
            }
            colend--;
            
            if(rowbegin<=rowend)
            {
               for(int i=colend;i>=colbegin;i--)
               {
                li.add(nums[rowend][i]);
               }
            }
             rowend--;
            if(colbegin<=colend)
            {
                for(int i=rowend;i>=rowbegin;i--)
                {
                    li.add(nums[i][colbegin]);
                }
            }
             colbegin++;
            }
    return li;
}
}