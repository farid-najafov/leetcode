package TopInterviewQuestions.Math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
 */
public class FizzBuzz {

    private static List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> i % 3 == 0 && i % 5 == 0 ?
                "FizzBuzz" : i % 3 == 0 ?
                "Fizz" : i % 5 == 0 ? "Buzz" :
                String.valueOf(i)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
