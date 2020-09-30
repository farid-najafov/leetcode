package TopInterviewQuestions.Array;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */
public class PlusOne {
    
    private static int[] plusOneV1(int[] digits) {
        int len = digits.length;
        if (len == 1) {
            if (digits[0] != 9) {
                digits[0]++;
                return digits;
            } else return new int[]{1, 0};
        }
        if (digits[len - 1] != 9) {
            digits[len - 1]++;
            return digits;
        }
        if (digits[len - 1] == 9 && digits[len - 2] != 9) {
            digits[len - 2]++;
            digits[len - 1] = 0;
            return digits;
        }
        
        for (int i = 0; i < len; i++) {
            if (digits[i] != 9) break;
            if (i == len - 1) {
                int[] ints = new int[len + 1];
                ints[0] = 1;
                return ints;
            }
        }
        
        for (int i = 0; i < len - 1; i++) {
            if (digits[len - i - 1] == 9) {
                digits[len - i - 1] = 0;
            }
            if (digits[len - i - 2] != 9) {
                digits[len - i - 2]++;
                return digits;
            }
        }
        return digits;
    }
    
    private static int[] plusOneV2(int[] digits) {
        String s = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining());
        return new BigInteger(s).add(new BigInteger("1"))
                .toString().chars().map(x -> x - 48).toArray();
    }
    
    public int[] plusOneV3(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    
    public static void main(String[] args) {
        int[] data = {9, 9};
        System.out.println(Arrays.toString(plusOneV1(data)));
    }
}
