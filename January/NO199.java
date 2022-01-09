package January;

public class NO199 {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {    
            int len = queue.size();
            while(len>0)
            {
                 TreeNode temp=queue.poll();
                 if(temp.left!=null)queue.offer(temp.left);
                 if(temp.right!=null)queue.offer(temp.right);
                 if(len==1)res.add(temp.val);
                 --len;
            }
        }
        return res;
    }
}
