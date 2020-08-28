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
    public ListNode reverseList(ListNode head) {
        return reverseListAcc(head, null);
    }
    private ListNode reverseListAcc(ListNode head, ListNode acc) {
        if(head == null) {
            return acc;
        } else {
            acc = new ListNode(head.val, acc);
            return reverseListAcc(head.next, acc);
        }
    }
}