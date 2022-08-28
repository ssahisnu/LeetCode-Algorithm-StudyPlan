class Solution {
    //TC - O(N)
    //SC - O(N)
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        HashMap<Character, Integer> charToIndMap = new HashMap<>();
        int winSt=0;
        int res = 1;
        charToIndMap.put(s.charAt(0), 0);
        for(int iter=1;iter<s.length();iter++) {
            
            if(charToIndMap.containsKey(s.charAt(iter))){
                //update window sz
                winSt = Math.max(winSt, charToIndMap.get(s.charAt(iter))+1);
                //acdca when iter=4, winSt=3; but winSt should not be updated to 1 max()
            }
            charToIndMap.put(s.charAt(iter), iter);
            res = Math.max(res, iter-winSt+1);
        }
        
        return res;
    }
}
