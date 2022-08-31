package leetcode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * Example 1
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 */
public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null){
            current = current.next;
            length++;
        }

        length = length/2;
        while(length > 0){
            current = current.next;
            length--;
        }
        return current;
    }
}

/**
 * Definition for singly-linked list.
 */
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

