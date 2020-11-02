package TopInterviewQuestions.Strings;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/
 */
public class CountAndSay {

    private static String countAndSay(int n) {
        return rec(n, 1, "1");
    }

    private static String rec(int n, int x, String s) {

        if (x == n) return s;
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length()) {
                if (s.charAt(i) == s.charAt(j)) cnt++;
                else break;
                j++;
            }
            sb.append(cnt).append(s.charAt(i));
            cnt = 0;
            i = j;
        }

        return rec(n, x + 1, sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }
}
