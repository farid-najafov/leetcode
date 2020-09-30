package TopInterviewQuestions.Array;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 */
public class SingleNumber {
    
    private static int singleNumber(int[] nums) {
        AtomicInteger i = new AtomicInteger();
        Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> {
                    if (v == 1) i.set(k);
                });
        return i.get();
    }
    
    public static void main(String[] args) {
        int[] data = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(data));
    }
}
