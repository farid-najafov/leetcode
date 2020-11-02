package TopInterviewQuestions.Strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
 */
public class ReverseInteger {
    
    private static int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int i = x % 10;
            x /= 10;
            
            if (reversed > Integer.MAX_VALUE/10 ||
                    (reversed == Integer.MAX_VALUE / 10 && i > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 ||
                    (reversed == Integer.MIN_VALUE / 10 && i < -8)) return 0;
            
            reversed = reversed * 10 + i;
        }
        
        return reversed;
    }
    
    public static void main(String[] args) {
        
        System.out.println(reverse(-147483648));
    }
}
