package January;

public class NO501 {
	 List<Integer> list = new ArrayList<>();
	    TreeNode prv = null;
	    int count=0;
	    int maxcount = 0;
	    
	    public int[] findMode(TreeNode root) {
	        find(root);
	        int []res = new int[list.size()];
	        for(int i=0;i<list.size();++i)
	        {
	            res[i]=list.get(i);
	        }
	        return res;
	    }
	    private void find(TreeNode root)
	    {
	        if(root==null) return;
	        find(root.left);

	        if(prv==null)
	        {
	            count=1;
	        }else if( root.val==prv.val)
	        {
	            ++count;
	        }else{ count =1;}
	        
	        prv =root;

	        if(count==maxcount)
	        {
	           list.add(root.val);
	        }
	        else if(count>maxcount)
	        {
	            maxcount=count;
	            list.clear();
	            list.add(root.val);
	        }

	        find(root.right);
	    }
}
