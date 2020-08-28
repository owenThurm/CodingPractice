public class ReverseLinkedList {
  public static Node reverse(Node node) { 
    
    Node previousNode = null;
    Node currentNode = node;
    Node tempNode = null;
    
    while(currentNode != null) {
      tempNode = new Node();
      tempNode.value = currentNode.value;
      tempNode.next = previousNode;
      previousNode = tempNode;
      currentNode = currentNode.next;
    }
    return tempNode;
  }
}