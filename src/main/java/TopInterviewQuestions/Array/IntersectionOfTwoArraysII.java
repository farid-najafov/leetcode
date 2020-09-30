package TopInterviewQuestions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 */
public class IntersectionOfTwoArraysII {
    
    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> map = Arrays.stream(nums1).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        List<Integer> list = new ArrayList<>();
        Arrays.stream(nums2).filter(map::containsKey).forEach(v -> {
            list.add(v);
            map.replace(v, map.get(v) - 1);
            if (map.get(v) == 0) map.remove(v);
        });
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    public static void main(String[] args) {
        int[] data1 = {1, 2, 2, 1};
        int[] data2 = {2};
        System.out.println(Arrays.toString(intersect(data1, data2)));
    }
}
