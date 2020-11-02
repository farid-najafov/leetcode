package TopInterviewQuestions.LinkedList;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
 */
public class RemoveNthNodeFromEndOfList {

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

    ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode curr = new ListNode();
        curr.next = head;
        ListNode len = head;
        while (len != null) {
            cnt++;
            len = len.next;
        }

        cnt -= n;
        len = curr;

        while (cnt > 0) {
            cnt--;
            len = len.next;
        }

        len.next = len.next.next;
        return curr.next;
    }
}
