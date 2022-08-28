class Solution {
    
    //TC - O(p+s)
    //SC - O(charSet)
    public boolean checkInclusion(String p, String s) {
        
        int lenP = p.length();
        int lenS = s.length();
        if(lenP>lenS) return false;
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for(int i=0; i<lenP; ++i) {
            pFreq[p.charAt(i)-'a']++;
            sFreq[s.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; ++i){
            if(pFreq[i]==sFreq[i])
                count++;
        }
        for(int i=0; i<lenS-lenP; ++i){
            
            if(count==26) return true;
            char r = s.charAt(i+lenP);
            char l = s.charAt(i);
            //move window, remove l and add r
            sFreq[r-'a']++;
            if(sFreq[r-'a']==pFreq[r-'a'])
                count++;
            else if(sFreq[r-'a']==pFreq[r-'a']+1)
                count--;
            
            sFreq[l-'a']--;
            if(sFreq[l-'a']==pFreq[l-'a']-1)
                count--;
            else if(sFreq[l-'a']==pFreq[l-'a'])
                count++;
        }
        if(count==26) return true;
        return false;
    }
    
    //TC - O(p+(s-p)*charset)
    //SC - O(charset)
//     public boolean checkInclusion(String p, String s) {
        
//         if(s==null || p==null)
//             return false;
//         if(s.length() < p.length())
//             return false;
//         int[] pArr = new int[26];
//         int[] sArr = new int[26];
//         for(int i=0; i<p.length(); i++){
//             pArr[p.charAt(i) -'a']+=1;
//             sArr[s.charAt(i) -'a']+=1;
//         }
//         if(arrayEquals(pArr, sArr))
//             return true;
        
//         for(int i=p.length(); i<s.length(); ++i){
//             sArr[s.charAt(i-p.length()) -'a']-=1;
//             sArr[s.charAt(i) -'a']+=1;
//             if(arrayEquals(pArr, sArr))
//                 return true;
//         }
//         return false;
//     }
    
//     public boolean arrayEquals(int[] a , int[] b) {
//         for(int i=0; i<26; i++){
//             if(a[i]!=b[i])
//                 return false;
//         }
//         return true;
//     }
}
