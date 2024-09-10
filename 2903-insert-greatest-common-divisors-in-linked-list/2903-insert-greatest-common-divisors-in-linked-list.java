/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        ListNode prev = head;

        while(temp !=null){

            int gcdValue = GCD(prev.val,temp.val);
            ListNode insert = new ListNode(gcdValue);

            prev.next = insert;
            insert.next = temp;

            prev = temp;
            temp = temp.next;
            
        }
        return head;
    }

    public int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
}