class Solution {
    //TC - O(N)
    //SC - O(1)
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int prev = 1, cur=2;
        for(int i=3; i<=n; ++i){
            int t = cur;
            cur +=prev;
            prev = t;
        }
        return cur;
    }
}
