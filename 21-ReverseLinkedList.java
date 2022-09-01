class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head!=null){
            ListNode nex = head.next;
            head.next = prev;
            prev = head;
            head = nex;
        }
        return prev;
    }
}
