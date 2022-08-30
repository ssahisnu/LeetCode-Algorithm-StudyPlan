class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode iter = head.next;
        ListNode iter2 = head;
        boolean isDup = false;
        while(iter!=null){
            if(iter2.val!=iter.val){
                iter2.next = iter;
                iter2 = iter2.next;
            }
            iter = iter.next;
        }
        iter2.next = null;
        return head;
    }
}
