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
	//δ�ܳɹ� ��д������⵼���ڴ泬������
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode Pos = res;
        int tags=0;
        while(l1!=null||l2!=null)
        {
            ListNode temp = new ListNode();
            //��λʱ ����ж���������� ȡģ����
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
            //��ν���β�巨 ������һ���ռ�������ע��
            Pos = temp;
            l1 = l2.next;
            l1 = l2.next;
        }
        //�����λ������λ Ӧ���ټ�һ������
        if(tags>0)
        {
            Pos.next = new ListNode(1);
        }
        return res;
        
    }
}
