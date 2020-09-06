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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        while(head != null && head.val == val) head = head.next;
        ListNode curNode = head;
        while(curNode != null && curNode.next != null) {
            if(curNode.next.val == val) {
                ListNode tempNode = curNode.next.next;
                while(tempNode != null && tempNode.val == val) {
                    tempNode = tempNode.next;
                }
                curNode.next = tempNode;
            }
            curNode = curNode.next;
        }
        return head;
    }
}