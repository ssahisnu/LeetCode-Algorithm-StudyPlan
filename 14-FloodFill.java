class Solution {
    //TC - O(row*col)
    //SC - O(1)/O(row*col) //input is not modifiable
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc]) return image;
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    int[] dx = new int[]{-1,1,0,0};
    int[] dy = new int[]{0,0,-1,1};
    
    private void fill(int[][] img, int r, int c, int col, int ori){
        
        if(r<0 || r>=img.length || c<0 || c>=img[0].length || img[r][c]!=ori)
            return;
        
        img[r][c] = col;
        
        for(int i=0; i<=3; ++i){
            fill(img, r+dx[i], c+dy[i], col, ori);
        }
    }
}
