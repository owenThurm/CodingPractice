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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> nodeVals = new ArrayList();
        ListNode curNode = head;
        
        while(curNode != null) {
            nodeVals.add(curNode.val);
            curNode = curNode.next;
        }
        for(int i=0; i<nodeVals.size(); i++) {
            int j = nodeVals.size() - i - 1;
            int first = nodeVals.get(i);
            int second = nodeVals.get(j);
            if(first != second) {
                return false;
            }
        }
        return true;
    }
}