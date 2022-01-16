package January;

public class NO257 {
	  public List<String> binaryTreePaths(TreeNode root) {
	        List<String> res = new ArrayList<String>();
	        List<Integer> path =  new ArrayList<>();
	        recursion( root, res, path);
	        return res;
	    }
	    private void recursion(TreeNode root,List<String> res,List<Integer> path)
	    {
	        path.add(root.val);
	        //终止逻辑
	        if(root.left==null&&root.right==null)
	        {
	            StringBuilder sb = new StringBuilder();
	            int i =0;
	            //最后一个num不需要加->
	            for( i =0;i<path.size()-1;++i)
	            {
	                sb.append(path.get(i)).append("->");
	            }
	            sb.append(path.get(i));
	            res.add(sb.toString());
	        }
	        //单层递归
	        if(root.left!=null)
	        {
	            recursion(root.left,res,path);
	            path.remove(path.size()-1);
	        }
	        if(root.right!=null)
	        {
	            recursion(root.right,res,path);
	            path.remove(path.size()-1);
	        }

	    }
}
