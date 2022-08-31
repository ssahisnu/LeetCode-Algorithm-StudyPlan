class Solution {
    //TC - O(rows*cols)
    //SC - O(rows*cols)
    static class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] res = new int[rows][cols];
        for(int[] i: res)
            Arrays.fill(i, Integer.MAX_VALUE);
        Queue<Pair> q = new ArrayDeque<>();
        for(int i=0; i<rows; ++i){
            for(int j=0; j<cols; ++j){
                if(mat[i][j]==0){
                    res[i][j]=0;
                    q.offer(new Pair(i, j));
                }
            }
        }
        bfs(mat, res, q);
        return res;
    }

    int[][] dxy = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    private void bfs(int[][] mat, int[][] res, Queue<Pair> q) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        int curDis = 0;
        
        while(!q.isEmpty()){
            int sz = q.size();
            for(int j=0; j<sz; ++j){
                Pair p = q.poll();
                int r = p.row;
                int c = p.col;
                for(int i=0; i<4; ++i){
                    if(r+dxy[i][0]<0||r+dxy[i][0]>=rows||c+dxy[i][1]<0||c+dxy[i][1]>=cols)
                        continue;
                    if(res[r+dxy[i][0]][c+dxy[i][1]] > 1+curDis){
                        res[r+dxy[i][0]][c+dxy[i][1]] = 1+curDis;
                        q.offer(new Pair(r+dxy[i][0],c+dxy[i][1]));
                    }
                }
            }
            curDis++;
        }
    }
}
