class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Head var salag val asel tar remove kara
        while (head != null && head.val == val) {
            head = head.next;
        }

        // List rikami zali asel tar
        if (head == null) {
            return null;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.next.val == val) {
                // Node remove kara
                curr.next = curr.next.next;
            } else {
                // Pudhe ja
                curr = curr.next;
            }
        }

        return head;
    }
}