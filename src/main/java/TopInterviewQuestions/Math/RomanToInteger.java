package TopInterviewQuestions.Math;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/
 */
public class RomanToInteger {

    private static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            char next = (i + 1 == s.length()) ? ' ' : s.charAt(i + 1);

            switch (s.charAt(i)) {
                case 'I':
                    result += (next == 'V' || next == 'X') ? -1 : 1; break;
                case 'V':
                    result += 5; break;
                case 'X':
                    result += (next == 'L' || next == 'C') ? -10 : 10; break;
                case 'L':
                    result += 50; break;
                case 'C':
                    result += (next == 'D' || next == 'M') ? -100 : 100; break;
                case 'D':
                    result += 500; break;
                case 'M':
                    result += 1000; break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
