package TopInterviewQuestions.Strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
 */
public class ImplementStrStr {
    
    private static int strStr(String haystack, String needle) {
        return needle.isEmpty() ? 0 : haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }
    
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        
        System.out.println(strStr(haystack, needle));
    }
}
