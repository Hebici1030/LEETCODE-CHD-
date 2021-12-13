package LinkedList;

public class NO707 {
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(){}
	    ListNode(int val) {
	        this.val=val;
	    }
	}
	class MyLinkedList {
	    ListNode head;
	    int size;
	    public MyLinkedList() {
	        size = 0;
	        head= new ListNode(0);

	    }
	    public int get(int index) {
	        if (index < 0 || index >= size) {
	            return -1;
	        }
	        ListNode temp=this.head;
	        for(int i=0;i<=index;i++)
	        {
	            temp = temp.next;
	        }
	        return temp.val;
	    }
	    public void addAtHead(int val) {
	       addAtIndex(0,val);
	    }
	    public void addAtTail(int val) {
	        addAtIndex(size,val);
	    }
	    
	    public void addAtIndex(int index, int val) {
	        if (index > size) {
	            return;
	        }
	        if (index < 0) {
	            index = 0;
	        }
	        size++;
	        ListNode pred = head;
	        for (int i = 0; i < index; i++) {
	            pred = pred.next;
	        }
	        ListNode toAdd = new ListNode(val);
	        toAdd.next = pred.next;
	        pred.next = toAdd;
	    }
	    
	    public void deleteAtIndex(int index) {
	        if (index < 0 || index >= size) {
	            return;
	        }
	        
	        ListNode pred = head;
	        for (int i = 0; i < index; i++) {
	            pred = pred.next;
	        }
	        pred.next = pred.next.next;
	        size--;
	    }
	}
}
