package January;

public class NO216 {
	 public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> res  = new ArrayList<>();
	        LinkedList<Integer> path = new LinkedList<>();
	        combina(k,n,0,1,res,path);
	        return res;
	    }
	    private void combina(int num,int target,int sum,int startIndex,List<List<Integer>> res,LinkedList<Integer> path)
	    {
	        if(path.size()==num)
	        {
	            if(sum==target)
	            {
	                res.add(new ArrayList(path));
	            }
	            return;
	        }

	        for(int i=startIndex;i<=9;++i)
	        {
	            sum += i;
	            path.add(i);
	            combina(num,target,sum,i+1,res,path);
	            sum-=i;
	            path.removeLast();
	            
	        }


	    }
}
