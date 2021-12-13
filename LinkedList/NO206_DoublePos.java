package LinkedList;

public class NO206_DoublePos {
	 public ListNode reverseList(ListNode head) {
	        ListNode prv = null;
	        ListNode cur = head;
	        ListNode temp = null;
	        while(cur!=null)
	        {
	            temp = cur.next;
	            cur.next = prv;
	            prv = cur;
	            cur = temp;
	        }
	        return prv;
	    }
}
