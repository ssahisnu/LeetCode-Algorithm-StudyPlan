class Solution {
    //TC - O(2^N)
    //SC - O(N)
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        recur(n, k, 1, new ArrayList<>(), res);
        return res;
    }
    
    private void recur(int n, int k, int ind, List<Integer> cur, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int i=ind; i<=n; ++i){
            cur.add(i);
            recur(n, k-1, i+1, cur, res);
            cur.remove(cur.size()-1);
        }
        return;
    }
}
