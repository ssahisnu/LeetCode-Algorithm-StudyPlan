class Solution {
    //TC - N! x N - recursion runs for N! times and each time loop runs for max N times
    //SC - O(N + N) - visited arr + stack space
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        recur(res, new ArrayList<Integer>(), nums, nums.length, vis);
        return res;
    }
    
    private void recur(List<List<Integer>> res, List<Integer> cur, int[] nums, int n, boolean[] vis){
        if(cur.size()==n){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i=0; i<n; ++i){
            if(!vis[i]){
                cur.add(nums[i]);
                vis[i]=true;
                recur(res, cur, nums, n, vis);
                cur.remove(cur.size()-1);
                vis[i]=false;
            }
        }
    }

}
