package TopInterviewQuestions.Strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
 */
public class StringToInteger {
    
    private static int strToInt(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        
        String s = "";
        int result;
        
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == ' ') break;
            if ((str.charAt(i) == '-' || str.charAt(i) == '+') && i == 0) {
                if (str.charAt(i) == '-') s += "-";
            } else if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                s += str.charAt(i);
            } else break;
        }
        if (s.length() == 1 && s.equals("-") || s.length() == 0) return 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (s.charAt(0) == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(strToInt(s));
    }
}
