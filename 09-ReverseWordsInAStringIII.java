class Solution {
    
    //BCR - {O(N), O(1)}
    public String reverseWords(String s) {
        int prev = -1;
        char[] arr = s.toCharArray();
        for(int i=0; i<=s.length(); ++i){
            if(i==s.length() || arr[i]==' '){
                reverse(arr, prev+1, i-1);
                prev=i;
            }
        }
            
        return new String(arr);
    }
    
    private void reverse(char[] arr, int st, int end){
        while(st<end){
            char tem = arr[st];
            arr[st++] = arr[end];
            arr[end--] = tem;
        }
        return;
    }
    
    
    //TC - O(N)
    //SC - O(N)
//     public String reverseWords(String s) {
        
//         StringBuilder res = new StringBuilder();
//         StringBuilder cur;
//         for(String str: s.split(" ")){
//             if(str==null || str.equals("")) break;
//             cur = new StringBuilder(str);
//             res.append(cur.reverse()).append(" ");
//         }
//         return res.toString().substring(0, res.length()-1);
//     }
}
