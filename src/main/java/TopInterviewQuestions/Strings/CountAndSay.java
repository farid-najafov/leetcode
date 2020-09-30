package TopInterviewQuestions.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/
 */
public class CountAndSay {
    
//    private static String countAndSay(int n) {
//
//        return rec(n, 0, "111221");
//    }
//
//    private static String rec(int n, int i, String s) {
//
//        if (i == n) return s;
//
//        StringBuilder sb = new StringBuilder();
//
//        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//
//
//        map.forEach((k, v) -> sb.append(v).append(k));
//        System.out.println(sb.toString());
//        return rec(n, i + 1, sb.toString());
//    }
    
//    public static void main(String[] args) {
//        System.out.println(countAndSay(1));
//    }
}
