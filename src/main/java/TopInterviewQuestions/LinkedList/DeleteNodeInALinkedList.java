package TopInterviewQuestions.LinkedList;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
 */
public class DeleteNodeInALinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


