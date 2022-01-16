package January;

public class NO530 {
	 TreeNode prv;
	    int result = Integer.MAX_VALUE;
	    public int getMinimumDifference(TreeNode root) {
	        if(root==null) return 0;
	        Minimun(root);
	        return result;
	    }
	    private void Minimun(TreeNode root)
	    {
	        if(root==null) return;
	        Minimun(root.left);
	        if(prv!=null)
	        {
	            result = Math.min(result,root.val-prv.val);
	        }
	        prv =root;
	        Minimun(root.right);
	    }
}
