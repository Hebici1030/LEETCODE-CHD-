package ArrayType;

public class NO27 {
	//����ָ����Բ�����ʽ��д���� ����ָ��ʵ����ֻҪһ���ݽ����ٶȴ��ڵȼ���
	//����while��һ���ֿ���ֱ����һ��forѭ�� forѭ�����ٶȱ�Ȼ������ָ��
	public int removeElement(int[] nums, int val) {
        //�ⷨ�� ����ָ��
        int fast = 0,slow = 0;
        int size = nums.length;
        while(fast<size)
        {
            if(nums[fast]!=val)
            {
               nums[slow++]=nums[fast++];
            }else
            {
                ++fast;
            }
        }
        return slow;
    }
}
