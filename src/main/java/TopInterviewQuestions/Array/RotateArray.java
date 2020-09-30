package TopInterviewQuestions.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {
    
    private static int[] rotateV1(int[] nums, int k) {
        int[] result = new int[nums.length];
        IntStream.range(0, nums.length).forEach(i -> result[(i + k) % nums.length] = nums[i]);
        return result;
    }
    
    private static int[] rotateV2(int[] nums, int k) {
        k %= nums.length;
        int temp, prev;
        for (int i = 0; i < k; i++) {
            prev = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[] data = {-1,-100,3,99};
        int k = 2;
        System.out.println(Arrays.toString(rotateV1(data, k)));
    }
}
