package LinkedList;

public class NO206_Recursion {
	public ListNode reverseList(ListNode head) {
        return revers(null,head);
    }
    public ListNode revers(ListNode prv,ListNode cur)
    {
        if(cur==null)return prv;
        ListNode temp = cur.next;
        cur.next = prv;
        return revers(cur,temp);
    }
}
