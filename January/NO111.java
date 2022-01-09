package January;

public class NO111 {
	 public int minDepth(TreeNode root) {
	        if(root==null) return 0;
	        Queue<TreeNode> queue = new LinkedList<>();
	        int res =0;
	        queue.offer(root);
	        while(!queue.isEmpty())
	        {
	            int len = queue.size();
	            while(len-->0)
	            {
	                TreeNode temp = queue.poll();
	                if(temp.left==null&&temp.right==null)return ++res;
	                if(temp.left!=null)queue.offer(temp.left);
	                 if(temp.right!=null)queue.offer(temp.right);
	            }
	            ++res;
	        }
	        return res;
	    }
}
