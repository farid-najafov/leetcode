package TopInterviewQuestions.Math;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
 */
public class PowerOfThree {

    private static boolean isPowerOfThree(int n) {
        if (n < 1) return false;

        while (n > 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
