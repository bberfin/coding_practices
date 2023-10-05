import java.util.Arrays;

public class SumOfAbsoluteDifferenceInASortedArray {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int arrLen = nums.length;
        int[] result = new int[arrLen];
        int difference = 0;

        for (int num : nums) {
            difference += Math.abs(nums[0] - num);
        }
        result[0] = difference;


        for (int i = 1; i < arrLen; i++) {
            int xFactor = nums[i] - nums[i - 1];
            result[i] = result[i - 1] - ((arrLen - i) * xFactor) + (i * xFactor);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        int[] nums2 = {1, 4, 6, 8, 10};
        int[] nums3 = {10, 14, 15, 16, 20, 27};
        int[] nums4 = {2, 3, 4, 5, 6, 7};

        System.out.print(Arrays.toString(getSumAbsoluteDifferences(nums2)));
    }
}