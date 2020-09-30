package TopInterviewQuestions.Array;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 */
public class BestTimeToBuyAndSellStockII {
    
    private static int maxProfit(int[] prices) {
        return IntStream.range(1, prices.length).map(i -> Math.max(0, prices[i] - prices[i - 1])).sum();
    }
    
    public static void main(String[] args) {
        int[] data = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(data));
    }
}
