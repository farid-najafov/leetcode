package TopInterviewQuestions.Strings;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
 */
public class FirstUniqueCharacterInString {
    
    private static int firstUniqChar(String s) {
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
    
        return IntStream.range(0, s.length())
                .filter(i -> collect.get(s.charAt(i)) == 1)
                .findFirst().orElse(-1);
    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        
        System.out.println(firstUniqChar(s));
    }
}
