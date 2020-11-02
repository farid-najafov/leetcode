package TopInterviewQuestions.Math;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
 */
public class CountPrimes {

    private static boolean isPrime(int i) {
        if (i <= 1) return false;
        return IntStream.iterate(2, j -> j * j <= i, j -> j + 1).noneMatch(j -> i % j == 0);
    }

    private static int countPrimes(int n) {
        return (int) IntStream.range(2, n).filter(CountPrimes::isPrime).count();
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
