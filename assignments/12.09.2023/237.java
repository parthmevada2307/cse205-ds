/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      if (node.next == null) return;

      if (node.next != null) {
          int nextvalue = node.next.val;
          node.next = node.next.next;
          node.val = nextvalue;
      }
    }
}