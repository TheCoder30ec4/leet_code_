class Solution {
    public ListNode middleNode(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow by one step
            fast = fast.next.next;   // Move fast by two steps
        }

        return slow;
    }
}
