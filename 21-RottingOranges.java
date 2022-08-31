Class Solution {
    
    //TC - O(rows*cols)
    //SC - O(rows*cols)
    static class Node{
        int i;
        int j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cZ=0;
        Queue<Node> q = new ArrayDeque<>();
        for(int i=0; i<n; ++i) {
            for(int j=0; j<m; ++j) {
                if(grid[i][j]==0) cZ++;
                if(grid[i][j]==2) q.offer(new Node(i,j));
            }
        }
        
        if(cZ==n*m || q.size()==n*m) return 0;
        
        int days = 0;
        int count = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int ind=0; ind<size; ++ind) {
                Node cur = q.poll();
                int row = cur.i;
                int col = cur.j;
                for(int i=0; i<4; ++i) {
                    if(row+dx[i]<n && row+dx[i]>=0 
                       &&col+dy[i]<m && col+dy[i]>=0 
                       && grid[row+dx[i]][col+dy[i]]==1) {
                        grid[row+dx[i]][col+dy[i]] = 2;
                        q.offer(new Node(row+dx[i],col+dy[i]));
                    }
                }
            }
            count+=size;
            days++;
        }
        
        return(count+cZ==n*m)? days-1 : -1;
    }
}
