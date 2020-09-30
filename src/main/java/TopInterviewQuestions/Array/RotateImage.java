package TopInterviewQuestions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
 */
public class RotateImage {
    
    private static List<Integer> toList(int[][] m) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(m).forEach(ints -> Arrays.stream(ints, 0, m.length).forEach(list::add));
        return list;
    }
    
    private static void rotate(int[][] m) {
        int len = m.length;
        
        List<Integer> list = toList(m);
        int[] ints = list.stream().mapToInt(i -> i).toArray();
        
        int i = len - 1, x = 0;
        while (i >= 0) {
            for (int j = 0; j < len; j++) {
                m[j][i] = ints[x * 4 + j];
            }
            i--;
            x++;
        }
        
        System.out.println(Arrays.deepToString(m));
    }
    
    
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        
        rotate(matrix);
    }
}
