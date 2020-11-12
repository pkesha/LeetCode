package com.parhamkeshavarzi;

/**
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

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

public class ReverseLinkedList {
    /*
    ListNode previous, current, next;

    previous = null;
    current = head;

    while(current != null){
        next = current.next;
        //The next one points to previous
        current.next = previous;
        //which is the current one
        previous = current;
        //This is moving onto the next one
        current = next;
    }

    head = prev;
    return previous;
    */

}
