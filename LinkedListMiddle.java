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
    public ListNode middleNode(ListNode head) {
        //two pointers - one twice as fast
        ListNode pointerOne = head;
        ListNode pointerTwo = head;
        
        
        //while pointer two.next is not null -> 
        //if pointer two.next.next is null -> return pointer one.next
        //else move pointerTwo two spots forward and pointerOne one spot forward
        while(pointerTwo.next != null) {
            if(pointerTwo.next.next == null) return pointerOne.next;
            pointerTwo = pointerTwo.next.next;
            pointerOne = pointerOne.next;
        }
        
        //return pointerOne
        return pointerOne;
        
        
    }
}