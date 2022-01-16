package January;

public class NO373 {
	 //声名优先队列
    PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->nums1[a[0]] + nums2[a[1]] - (nums1[b[0]] + nums2[b[1]]));
    //
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    //
    int m =nums1.length;int n =nums2.length;
    for(int i=0;i<Math.min(k,m);++i)
    {
        queue.offer(new int[]{i,0});
    }
    //循环取出答案 并且将 （1，0）放入堆中比较
    while(k-->0&&!queue.isEmpty())
    {
        int []index = queue.poll();
        res.add(Arrays.asList(nums1[index[0]], nums2[index[1]]));

        if(++index[1]<n)
        {
            queue.offer(new int[]{index[0],index[1]});
        }
    }
    return res;
}
}
