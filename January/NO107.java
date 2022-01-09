package January;

public class NO107 {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        LinkedList<List<Integer>> list = new LinkedList<>();
	        if(root==null)return list;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        while(!queue.isEmpty())
	        {
	            List<Integer> temp = new ArrayList<>();
	            int len = queue.size();
	            while(len>0)
	            {
	                 TreeNode tempNode = queue.poll();
	                 temp.add(tempNode.val);
	                 if(tempNode.left!=null)queue.offer(tempNode.left);
	                 if(tempNode.right!=null)queue.offer(tempNode.right);
	                 --len;
	            }
	            list.addFirst(temp);
	        }
	        return list;
	    }
}
