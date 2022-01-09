package January;

public class NO102 {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>>  res = new ArrayList<List<Integer>>();
	        if(root==null)return res;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        while(!queue.isEmpty())
	        {
	            List<Integer>  temp = new ArrayList<>();
	            int len = queue.size();
	            while(len>0)
	            {
	            TreeNode tempNode = queue.poll();
	            temp.add(tempNode.val);
	            if(tempNode.left!=null){queue.offer(tempNode.left);}
	            if(tempNode.right!=null){queue.offer(tempNode.right);}
	            --len;
	            }
	            
	            res.add(temp);
	        }
	        return res;
	    }
}
