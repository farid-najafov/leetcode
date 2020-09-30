package TopInterviewQuestions.Array;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 */
public class MoveZeros {
    
    private static void moveZerosV1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
    private static void moveZerosV2(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        int[] data = {0, 1, 0, 3, 12};
        moveZerosV2(data);
    }
}
