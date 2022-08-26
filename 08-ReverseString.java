class Solution {
    //TC - O(N)
    //SC - O(1)
    public void reverseString(char[] s) {
        
        int st = 0;
        int end = s.length-1;
        
        while(st<end) {
            char tmp = s[st];
            s[st] = s[end];
            s[end] = tmp;
            
            st++;
            end--;
        }
    }
}
