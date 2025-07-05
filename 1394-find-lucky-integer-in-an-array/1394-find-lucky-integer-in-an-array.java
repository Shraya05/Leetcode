class Solution {
    public int findLucky(int[] arr) {
        int val=Arrays.stream(arr).max().getAsInt();
       int freq[]=new int[val+1];
       int max=-1;
       for(int i=0;i<arr.length;i++)
       {
        freq[arr[i]]++;
       } 
       for(int i=1;i<freq.length;i++)
       {
        if(freq[i]!=0 && freq[i]==i) 
        {
            max=Math.max(max,i);
        }
       }
       return max;
    }
}