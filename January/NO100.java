package January;

public class NO100 {
	  private boolean Symmertric(TreeNode leftTree,TreeNode rightTree)
	    {
	        if(leftTree==null&&rightTree==null)return true;
	        if(leftTree==null&&rightTree!=null)return false;
	        if(leftTree!=null&&rightTree==null)return false;
	        if(leftTree.val!=rightTree.val)return false;
	        boolean left = Symmertric(leftTree.left,rightTree.left);
	        boolean right = Symmertric(leftTree.right,rightTree.right);
	        return left&&right;
	    }
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        return Symmertric(p,q);
	    }
}
