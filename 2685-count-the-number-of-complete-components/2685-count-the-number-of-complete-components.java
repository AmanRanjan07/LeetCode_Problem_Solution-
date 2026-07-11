class Solution {

    int nodeCount;
    int edgeCount;

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        int ans = 0;

        for(int i = 0; i < n; i++){

            if(!visited[i]){

                nodeCount = 0;
                edgeCount = 0;

                dfs(i, graph, visited);

                edgeCount /= 2;

                int requiredEdges = nodeCount * (nodeCount - 1) / 2;

                if(edgeCount == requiredEdges)
                    ans++;
            }
        }

        return ans;
    }

    private void dfs(int node,
                     ArrayList<Integer>[] graph,
                     boolean[] visited){

        visited[node] = true;

        nodeCount++;

        edgeCount += graph[node].size();

        for(int next : graph[node]){

            if(!visited[next])
                dfs(next, graph, visited);
        }
    }
}