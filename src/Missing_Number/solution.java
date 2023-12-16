package Missing_Number;

public class solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        float totalSum = size * (size + 1) / 2;
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        return (int) (totalSum - sum);
    }


//        int n = nums.length, sum = n * (n + 1) / 2;
//        for (int i : nums) sum -= i;
//        return sum;
//    }
}
