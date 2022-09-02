class Solution {
    //TC - O(2^N) - 2 postibility for each char
    //SC - O(N) recursion stack space + charArray
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, 0, s.toCharArray());
        return ans;
    }
    public void backtrack(List<String> ans, int i, char[] S){
        if(i==S.length)
            ans.add(new String(S));
        else{
            if(Character.isLetter(S[i])){
                S[i] = Character.toUpperCase(S[i]);
                backtrack(ans, i+1, S); 
                S[i] = Character.toLowerCase(S[i]);
                backtrack(ans, i+1, S);
            }
            else
                backtrack(ans, i+1, S); 
        }
    }
}
