class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
         int len = graph.length;

        List<List<Integer>> nm = new ArrayList<>();

        for(int i = 0; i < len; i++)
        {
            nm.add(new ArrayList<>());
        }


        int indegree[] = new int[len];

        for(int i = 0; i < len; i++)
        {
            for(int p: graph[i])
            {
                nm.get(p).add(i);
                indegree[i]++;
            }
        }


        Queue<Integer> pq = new LinkedList<>();


        for(int i = 0; i < len; i++)
        {
            if(indegree[i] == 0)
            {
                pq.offer(i);
            }
        }


        boolean vis[] = new boolean[len];

        while(!pq.isEmpty())
        {
            int val = pq.poll();
            vis[val] = true;
            
            for(int p: nm.get(val))
            {
                indegree[p]--;

                if(indegree[p] == 0)
                {
                    pq.offer(p);
                }
            }
        }


        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < len; i++)
        {
            if(vis[i])
            {
                ans.add(i);
            }
        }

        return ans;
    }
}