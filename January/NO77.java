package January;

public class NO77 {
	  public List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> res = new ArrayList<>();
	        LinkedList<Integer> path = new LinkedList<>();
	        toCombine(n,k,1,res,path);
	         return res;
	    }
	    private void toCombine(int n,int k,int startIndex,List<List<Integer>> res,LinkedList<Integer> path)
	    {
	        if (path.size() == k){
	            res.add(new ArrayList<>(path));
	            return;
	        }

	        for (int i = startIndex; i <= n; i++){
	            path.add(i);
	            toCombine(n, k, i + 1,res,path);
	            path.removeLast();
	        }

	    }
}
