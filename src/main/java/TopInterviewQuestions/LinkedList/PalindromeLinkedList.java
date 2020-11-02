package TopInterviewQuestions.LinkedList;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772
 */
public class PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        slow = reverseList(slow);

        while (slow != null) {
            if (slow.val != fast.val) return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
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
}
