package LinkedList;

public class NO19 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head==null )return null;
	        if(head.next==null&&n==1)return null;
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;
	        ListNode fast = dummy;
	        ListNode slow = dummy;
	        while(n-->0)
	        {
	            fast =fast.next;
	        }
	        while(fast.next!=null)
	        {
	            fast =fast.next;
	            slow=slow.next;
	        }
	        slow.next = slow.next.next;
	        return dummy.next;

	    }
}
