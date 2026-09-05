package week4;

public class MaximumSubarray {

    static int maxSubArray(int[] nums) {

        int current = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (current + nums[i] > nums[i])
                current = current + nums[i];
            else
                current = nums[i];

            if (current > maximum)
                maximum = current;
        }

        return maximum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));
    }
}
