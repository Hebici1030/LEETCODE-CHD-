package LinkedList;

public class NO203 {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
        return head;
    }
    // ��Ϊɾ�������漰��ͷ�ڵ㣬��������dummy�ڵ㣬ͳһ����
    ListNode dummy = new ListNode(-1, head);
    ListNode pre = dummy;
    ListNode cur = head;
    while (cur != null) {
        if (cur.val == val) {
            pre.next = cur.next;
        } else {
            pre = cur;
        }
        cur = cur.next;
    }
    return dummy.next;
}
}
