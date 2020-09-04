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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode curNodeOne = l1;
        ListNode curNodeTwo = l2;
        ListNode head = new ListNode();
        ListNode tail = new ListNode();
        
        if(l1 == null && l2 == null) {
            return null;
        } 
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        
        
        if(l1.val <= l2.val) {
            head.val = curNodeOne.val;
            curNodeOne = curNodeOne.next;
        } else {
            head.val = curNodeTwo.val;
            curNodeTwo = curNodeTwo.next;
        }
        head.next = tail;
        while(curNodeOne != null || curNodeTwo != null) {
            if(curNodeOne == null) {
                while(curNodeTwo != null) {
                    tail.val = curNodeTwo.val;
                    if(curNodeTwo.next != null) {
                        tail.next = new ListNode();
                        tail = tail.next;
                    }
                    curNodeTwo = curNodeTwo.next;
                }
                break;
            } else if(curNodeTwo == null) {
                while(curNodeOne != null) {
                    tail.val = curNodeOne.val;
                    if(curNodeOne.next != null) {
                        tail.next = new ListNode();
                        tail = tail.next;
                    }
                    curNodeOne = curNodeOne.next;
                }
                break;
            }
            if(curNodeOne.val <= curNodeTwo.val) {
                tail.val = curNodeOne.val;
                tail.next = new ListNode();
                tail = tail.next;
                curNodeOne = curNodeOne.next;
            } else {
                tail.val = curNodeTwo.val;
                tail.next = new ListNode();
                tail = tail.next;
                curNodeTwo = curNodeTwo.next;
            }
        }
        return head;
    }
}