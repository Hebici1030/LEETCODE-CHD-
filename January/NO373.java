package January;

public class NO373 {
	 //�������ȶ���
    PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->nums1[a[0]] + nums2[a[1]] - (nums1[b[0]] + nums2[b[1]]));
    //
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    //
    int m =nums1.length;int n =nums2.length;
    for(int i=0;i<Math.min(k,m);++i)
    {
        queue.offer(new int[]{i,0});
    }
    //ѭ��ȡ���� ���ҽ� ��1��0��������бȽ�
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
