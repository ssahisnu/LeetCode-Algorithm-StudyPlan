class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        
        ListNode fast = head, slow = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null) slow = slow.next;
        return slow;
    }
}
