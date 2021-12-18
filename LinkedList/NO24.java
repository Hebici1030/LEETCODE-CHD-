package LinkedList;

public class NO24 {
	public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode asumHead = new ListNode(0);
        asumHead.next = head;
        ListNode cur = asumHead;
        while(cur.next!=null&&cur.next.next!=null)
        {
            ListNode temp = cur.next;
            ListNode temp2 = cur.next.next;
            cur.next = temp2;
            temp.next = temp2.next;
            temp2.next=temp;
            cur = temp;
        }
        return asumHead.next;
        }
}
