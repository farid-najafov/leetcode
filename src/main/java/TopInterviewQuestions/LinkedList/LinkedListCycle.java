package TopInterviewQuestions.LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
 */
public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            next = null;
        }
    }

    boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }
}
