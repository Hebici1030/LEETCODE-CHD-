package January;

public class NO101 {
	  public boolean isSymmetric(TreeNode root) {
	        Deque<TreeNode> queue = new LinkedList<>();
	        queue.offer(root.left);
	        queue.offer(root.right);
	        while(!queue.isEmpty())
	        {
	            TreeNode temp1 = queue.poll();
	            TreeNode temp2 = queue.poll();
	            if(temp1==null&&temp1==null)continue;
	            if(temp1==null||temp2==null||temp1.val!=temp2.val)
	            return false;
	            queue.offer(temp1.left);
	            queue.offer(temp2.right);
	            queue.offer(temp1.right);
	            queue.offer(temp2.left);
	        }
	        return true;
	    }
}
