package January;

public class NO450 {
	 public TreeNode deleteNode(TreeNode root, int key) {
	        return delete(root,key);
	    }
	    private TreeNode delete(TreeNode root,int key)
	    {
	        if(root==null) return null;
	        if(root.val < key)root.right =delete(root.right,key);
	        else if(root.val > key)root.left=delete(root.left,key);
	        else if(root.val==key)
	        {
	            if(root.left==null)return root.right;
	             if(root.right==null)return root.left;
	             TreeNode temp =root.right;
	             while(temp.left!=null)
	             {
	                 temp=temp.left;
	             }
	             root.val =temp.val;
	             root.right =delete(root.right,temp.val);
	        }
	        return root;
	    }
}
