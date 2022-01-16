package January;

public class NO404 {
	 public int sumOfLeftLeaves(TreeNode root) {
	        if(root==null) return 0;
	        int sum =0;
	        if(root.left!=null&&root.left.right==null&&root.left.left==null)
	        {
	            sum += root.left.val;
	        }
	        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+sum;
	    }
}
