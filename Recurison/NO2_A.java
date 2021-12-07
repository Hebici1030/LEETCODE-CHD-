package Recursion;

public class NO2_A {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   ListNode xList = new ListNode(0);  //�����׽ڵ�
		        ListNode newList= xList;  //����һ�������������ƶ�������ָ��ǰ�ڵ�
		        int curr = 0;
		        while(l1 != null || l2 != null){
		            //��ȡ�����ֵ
		            int x = l1 != null ? l1.val:0;
		            int y = l2 != null ? l2.val:0;
		            //�����
		            int sum = x + y + curr;
		            curr = sum /10 ;
		            ListNode sumNode = new ListNode(sum % 10 ); //�����µĽڵ�
		            //�ƶ�ָ��ָ����һ��ֵ
		            newList.next= sumNode; //���½ڵ�������
		            newList = newList.next; //��ǰ�ڵ������ƶ�
		            if(l1 != null) l1 = l1.next; //���ڵ�����ƶ�����l1����һ���ڵ���д���
		            if(l2 != null) l2 = l2.next; //���ڵ�����ƶ�����l2����һ���ڵ���д���
		        }
		        if(curr > 0){
		            newList.next = new ListNode(curr);
		        }
		        return xList.next;
		    }
}
