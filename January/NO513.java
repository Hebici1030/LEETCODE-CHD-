package January;

public class NO513 {
	 int maxLeftNum =0;
	    int maxDepth =0;
	    private void maxdepth(TreeNode root,int lenOfleft)
	    {
	        if(root.left==null&&root.right==null)
	        {
	            if(lenOfleft>maxDepth)
	            {
	            maxDepth = lenOfleft;
	            maxLeftNum = root.val;
	            }
	        }
	          if(root.left!=null)
	            {
	                maxdepth(root.left,lenOfleft+1);
	            }
	            if(root.right!=null)
	            {
	                maxdepth(root.right,lenOfleft+1);
	            }

	    }
	    public int findBottomLeftValue(TreeNode root) {
	        int temp=1;
	        maxdepth(root,temp);
	        return maxLeftNum;
	    }
}
