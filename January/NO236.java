package January;

public class NO236 {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
	        return  commonAcestor(root,p,q);
	    }
	    private TreeNode commonAcestor(TreeNode root,TreeNode p,TreeNode q)
	    {
	        //ÖÕÖ¹Ìõ¼þ
	        if(root==null||root==p||root==q) return root;

	        TreeNode left = commonAcestor(root.left,p,q);
	        TreeNode right = commonAcestor(root.right,p,q);

	        if(left!=null&&right!=null)return root;
	        else if(left==null) return right;

	        return left; 
	    }
}
