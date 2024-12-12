class Solution {
    public long pickGifts(int[] gifts, int k) {
       PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:gifts)
       {
        maxheap.add(num);
       }
       for(int i=0;i<k;i++)
       {
        int large=maxheap.poll();
        int left=(int)Math.sqrt(large);
        maxheap.add(left);
       }
       long sum=0;
       while(!maxheap.isEmpty())
       {
        sum+=maxheap.poll();
       }
       return sum;
    }
}