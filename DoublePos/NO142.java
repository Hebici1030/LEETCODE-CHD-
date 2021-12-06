package DoubleP;

public class NO142 {
	 /*public ListNode detectCycle(ListNode head) {
    //快慢指针则为常数空间
    ListNode fast = head;
    ListNode slow = head;
    while(fast!=slow)
    {
        if(fast!=null||fast.next==null)return null;
        fast=fast.next.next;
        slow = slow.next;
    }
    fast = head;
    while(fast!=slow)
    {
        slow =slow.next; 
        fast =fast.next;
    }
    return fast;
}*/
public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {// 有环
            ListNode index1 = fast;
            ListNode index2 = head;
            // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
            while (index1 != index2) {
                index1 = index1.next;
                index2 = index2.next;
            }
            return index1;
        }
    }
    return null;
}
}
