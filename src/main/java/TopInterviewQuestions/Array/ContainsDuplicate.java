package TopInterviewQuestions.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 */
public class ContainsDuplicate {
    
    // naive solution, exceeded time limit
    private static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    
    private static boolean containsDuplicateV2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
    
    private static boolean containsDuplicateV3(int[] nums) {
        Arrays.sort(nums);
        return IntStream.range(0, nums.length - 1).anyMatch(i -> nums[i] == nums[i + 1]);
    }
    
    private static boolean containsDuplicateV4(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
    
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5};
        System.out.println(containsDuplicateV2(data));
    }
}
