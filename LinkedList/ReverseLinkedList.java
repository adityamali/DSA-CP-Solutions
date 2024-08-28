// LINK: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
// Reverse a linked list
// Given the head of a linked list, the task is to reverse this list and return the reversed head.

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node lastNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node temp = currentNode.next;
            currentNode.next = lastNode;
            lastNode = currentNode;
            currentNode = temp;
        }
        head.next = null;
        return lastNode;
    }
}