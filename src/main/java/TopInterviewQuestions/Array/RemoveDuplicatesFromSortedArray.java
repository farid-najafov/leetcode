package TopInterviewQuestions.Array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicatesFromSortedArray {
    
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] data = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        System.out.println(removeDuplicates(data));
    }
}
