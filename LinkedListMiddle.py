# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        pointer1 = head
        pointer2 = head
        while not pointer2.next is None:
            if pointer2.next.next is None: return pointer1.next
            else:
                pointer1 = pointer1.next
                pointer2 = pointer2.next.next
        return pointer1


