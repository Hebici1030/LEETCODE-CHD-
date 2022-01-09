package January;

public class NO104 {
	 public int maxDepth(TreeNode root) {
	        if(root==null) return 0;
	        return postOrederDepth(root);
	    }
	    private int postOrederDepth(TreeNode root)
	    {
	        if(root==null) return 0;
	        int leftDepth=postOrederDepth(root.left);
	        int rightDepth=postOrederDepth(root.right);
	        return Math.max(rightDepth,leftDepth)+1;
	    }
}
