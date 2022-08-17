class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findmiddle(head);
        ListNode secondhalfhead=reverse(middle.next);
        ListNode firsthalfhead=head;
        while(secondhalfhead!=null){
            if(firsthalfhead.val!=secondhalfhead.val){
                return false;
            }
            firsthalfhead=firsthalfhead.next;
            secondhalfhead=secondhalfhead.next;
        }
        return true;
        }
    public ListNode findmiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
