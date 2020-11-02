package TopInterviewQuestions.LinkedList;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
 */
public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode savedNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = savedNext;
        }
        head = prev;

        return head;
    }

    // recursive approach
    ListNode reverseListRec(ListNode head) {
        head = reverser(head, null);
        return head;
    }

    private ListNode reverser(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode savedNext = curr.next;
        curr.next = prev;
        return reverser(savedNext, curr);
    }
}
