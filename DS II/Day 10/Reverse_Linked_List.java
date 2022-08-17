class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head.next=null;
        head=prev;
        return head;
    }
}
