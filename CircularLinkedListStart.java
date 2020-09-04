/*

Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop. 
DEFINITION Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node,
 so as to make a loop in the linked list. EXAMPLE Input: A->B->C->D->E->C [the same C as earlier] Output:C
*/

public class testing {
	public ListNode<T> circularLink(ListNode<T> head) {
		ListNode<T> curNode = head;
		Set<T> nodeSet = new HashSet<T>();
		while(!nodeSet.contains(curNode)) {
			nodeSet.add(curNode);
			curNode = curNode.next;
		}
		return curNode;
	}
}

