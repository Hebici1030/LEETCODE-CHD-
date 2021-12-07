package Recursion;

import DoubleP.NO142.ListNode;

public class NO2_R {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        return recurion(l1,l2,0);
	    }
	    private ListNode recurion(ListNode l1,ListNode l2,int tags)
	    {
	        if(l1==null&&l2==null&&tags==0) return null;
	        //��Ԫ���Ų���ֻ���ж�ʽ�����
	        int curr =  (l1==null?0:l1.val)+(l2==null?0:l2.val)+tags;
	        tags = curr/10;
	        ListNode res =  new ListNode(curr%10);
	        ListNode con = recurion((l1==null?l1:l1.next),(l2==null?l2:l2.next),tags);
	        res.next = con;
	        //�ݹ�Ĺؼ����ҵ���һ�����صĽ��
	        return res;
	    }
}
