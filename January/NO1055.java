package January;

public class NO1055 {
	 Arrays.sort(nums);
     for (int i = 0; i < nums.length && k > 0; i++, k--) {
         if (nums[i] >= 0) break;
         nums[i] = -nums[i];
     }
     int sum = 0;
     Arrays.sort(nums);
     for (int n : nums) sum += n;
     if (k != 0 && k % 2 != 0) sum -= 2 * nums[0];
     return sum;
}
