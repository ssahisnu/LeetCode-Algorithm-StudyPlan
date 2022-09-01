class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2);
    }
    ListNode merge(ListNode h1, ListNode h2){
        ListNode res = new ListNode(-1);
        ListNode iter = res;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                iter.next = h1;
                iter = h1;
                h1 = h1.next;
            } else{
                iter.next = h2;
                iter = h2;
                h2 = h2.next;
            }
        }
        
        if(h1!=null) iter.next = h1;
        else iter.next = h2; 
        return res.next;
    }
}
