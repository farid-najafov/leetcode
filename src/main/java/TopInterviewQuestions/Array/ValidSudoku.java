package TopInterviewQuestions.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
 */
public class ValidSudoku {
    
    // should be optimized
    private static boolean isValidSudoku(char[][] board) {
        int ic = 0;
        int ir = 0;
        
        for (int i = 0; i < board.length; i++) {
            if (checkRows(board[i])) return false;
            if (checkColumns(board, i)) return false;
            if (checkSquares(board, ic, ir)) return false;
            
            ic += 3;
            if (ic == 9) {
                ir += 3;
                ic = 0;
            }
        }
        
        return true;
    }
    
    private static boolean checkRows(char[] chars) {
        List<Character> collect = IntStream.range(0, chars.length)
                .mapToObj(c -> chars[c]).filter(c -> c != '.')
                .collect(Collectors.toList());
        
        return new HashSet<>(collect).size() != collect.size();
    }
    
    private static boolean checkColumns(char[][] board, int idx) {
        List<Character> list = new ArrayList<>();
        
        for (char[] chars : board) {
            list.add(chars[idx]);
        }
        
        list = list.stream().filter(c -> c != '.').collect(Collectors.toList());
        return list.size() != new HashSet<>(list).size();
    }
    
    private static boolean checkSquares(char[][] b, int ic, int ir) {
        List<Character> list = new ArrayList<>();
        
        for (int i = ir; i < ir + 3; i++) {
            for (int j = ic; j < ic + 3; j++) {
                list.add(b[i][j]);
            }
        }
        
        list = list.stream().filter(c -> c != '.').collect(Collectors.toList());
        return list.size() != new HashSet<>(list).size();
    }
    
    
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        
        System.out.println(isValidSudoku(board));
    }
}
