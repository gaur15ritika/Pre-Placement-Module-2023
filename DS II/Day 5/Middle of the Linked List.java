class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middleElement=middle(head);
        ListNode newhead=middleElement;
        while(middleElement!=null){
            middleElement=middleElement.next;
            }
        return newhead;
        
    }
    public int size(ListNode head){
        int size=0;
        ListNode curr=head;
        while(curr!=null){
          size++;
            curr=curr.next;
        }
        return size;
    }
    public ListNode middle(ListNode head){
       ListNode hare=head;
        ListNode turtle=head;
        
        while(hare.next!=null && hare.next.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        int len=size(head);
        if(len%2==0){
            return turtle.next;
        }
        return turtle;
    }
    
}
