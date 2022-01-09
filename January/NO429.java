package January;

public class NO429 {
	 public List<List<Integer>> levelOrder(Node root) {
	        List<List<Integer>> res = new ArrayList<>();
	        if(root==null) return res;
	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(root);
	        while(!queue.isEmpty())
	        {
	            List<Integer> temp= new ArrayList<>();
	            int len = queue.size();
	            for(int i=0;i<len;++i)
	            {
	                Node tempNode = queue.poll();
	                List<Node> listOfChildren=tempNode.children;
	                for(Node Point:listOfChildren)
	                {
	                    queue.offer(Point);
	                }
	                temp.add(tempNode.val);
	            }
	            res.add(temp);
	        }
	        return res;
	    }
}
