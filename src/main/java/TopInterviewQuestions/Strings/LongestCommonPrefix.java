package TopInterviewQuestions.Strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
 */
public class LongestCommonPrefix {

    private static String longestCommonPrefix(String[] strs) {
        String s = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
        int min = s.length();
        int cnt = 0;

        OUTER:
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) break OUTER;
            }
            cnt++;
        }
        return cnt == 0 ? "" : strs[0].substring(0, cnt);
    }

    public static void main(String[] args) {
        String[] data = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(data));
    }
}
