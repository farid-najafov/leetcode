package TopInterviewQuestions.Strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883
 */
public class ValidPalindrome {
    
    private static boolean isPalindromeV1(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length() < 2) return true;
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    
    private static boolean isPalindromeV2(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length() < 2) return true;
        
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindromeV2(s));
    }
}
