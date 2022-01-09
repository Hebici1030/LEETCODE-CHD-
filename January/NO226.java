package January;

public class NO226 {
	public TreeNode invertTree(TreeNode root) {
	      if(root==null)return root;
	      invertTree(root.left);
	      invertTree(root.right);
	      spawn(root); 
	      return root;
	    }
	    private void spawn(TreeNode node)
	    {
	        TreeNode tempNode = node.left;
	        node.left =node.right;
	        node.right = tempNode;
	    }
}
