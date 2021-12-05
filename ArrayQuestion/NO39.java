package ArrayType;

public class NO39 {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> ListAll =  new ArrayList<List<Integer>>();
	        List<Integer> List = new ArrayList<Integer>();
	        Arrays.sort(candidates);
	        find(ListAll,List,candidates,target,0);
	        return ListAll;
	    }
	    public void find(List<List<Integer>> ListAll,List<Integer> tmp,int[] candidates, int target,int num)
	    {
	        if(target==0)
	        {
	            ListAll.add(tmp);
	            return;
	        }
	        if(target<candidates[0])return;
	        for(int i = num;i<candidates.length&&candidates[i]<=target;i++)
	        {
	            List<Integer> List = new ArrayList<Integer>(tmp);
	            List.add(candidates[i]);
	            find(ListAll,List,candidates,target-candidates[i],i);
	        }
	    }
}
