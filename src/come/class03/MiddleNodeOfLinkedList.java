package come.class03;

public class MiddleNodeOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
