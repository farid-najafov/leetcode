package TopInterviewQuestions.Strings;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
 */
public class ReverseString {
    private static void reverseStringV1(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i++] = s[j];
            s[j--] = tmp;
        }
        System.out.println(Arrays.toString(s));
    }
    
    private static void reverseStringV2(char[] s) {
        int len = s.length;
        
        IntStream.range(0, len / 2).forEach(i -> {
            char tmp = s[i];
            s[i] = s[len - i - 1];
            s[len- i - 1] = tmp;
        });
        
        System.out.println(Arrays.toString(s));
    }
    
    // recursive approach
    private static void reverseStringV3(char[] s) {
        helper(s, 0, s.length - 1);
        System.out.println(s);
    }
    
    private static void helper(char[] s, int i, int j) {
        if (i >= j) return;
        char tmp = s[i];
        s[i++] = s[j];
        s[j--] = tmp;
        helper(s, i, j);
    }
    
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseStringV2(s);
    }
}
