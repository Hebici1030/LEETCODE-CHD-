package Recursion;

import DoubleP.NO142.ListNode;

public class NO2 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	//未能成功 书写风格问题导致内存超出限制
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode Pos = res;
        int tags=0;
        while(l1!=null||l2!=null)
        {
            ListNode temp = new ListNode();
            //进位时 如何判断填入的数字 取模运算
            if(l1.val+l2.val+tags>9)
            {
                 temp.val = ((l1.val+l2.val+tags)%10);
                tags = 1;
            }else
            {
                 temp.val = ((l1.val+l2.val+tags)%10);
                tags = 0;
            }
            Pos.next = temp;
            //如何进行尾插法 在申请一个空间用来标注？
            Pos = temp;
            l1 = l2.next;
            l1 = l2.next;
        }
        //当最高位发生进位 应该再及一个数组
        if(tags>0)
        {
            Pos.next = new ListNode(1);
        }
        return res;
        
    }
}
