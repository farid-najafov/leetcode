package TopInterviewQuestions.Strings;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
 */
public class ValidAnagram {
    
    private static boolean isAnagramV1(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) sum++;
                if (t.charAt(i) == c) sum--;
            }
            if (sum != 0) return false;
        }
        return true;
    }
    
    private static boolean isAnagramV2(String a, String b) {
        int[] array = new int[26];
        
        for (int c = 0; c < Math.max(a.length(), b.length()); c++) {
            if (c < a.length() && a.charAt(c) != (char) 32) array[a.charAt(c) - 'a']++;
            if (c < b.length() && b.charAt(c) != (char) 32) array[b.charAt(c) - 'a']--;
        }
        
        for (int i : array) {
            if (i != 0) return false;
        }
        
        return true;
    }
    
    private static boolean isAnagramV3(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
    
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        
        System.out.println(isAnagramV3(s, t));
    }
}
