package January;

public class NO222 {
	public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = 0,rightHeight =0;
        TreeNode tempRight = root.right;
        TreeNode tempLeft = root.left;
        while(tempLeft!=null)
        {
            tempLeft=tempLeft.left;
            ++leftHeight;
        }
        while(tempRight!=null)
        {

            tempRight=tempRight.right;
            ++rightHeight;
        }
        if(leftHeight==rightHeight)
        return (2<<leftHeight)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
