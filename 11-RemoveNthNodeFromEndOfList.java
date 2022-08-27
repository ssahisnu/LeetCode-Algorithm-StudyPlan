class Solution {
    //TC - O(N)
    //SC - O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = findLen(head);
        int k = len - n;
        if(k==0) return head.next;
        ListNode prev = null;
        ListNode cur = head;
        while(k-->0){
            prev = cur;
            cur = cur.next;
        }
        
        prev.next = cur.next;
        return head;
    }
    
    private int findLen(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}
