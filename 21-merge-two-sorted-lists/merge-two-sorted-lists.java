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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // Traverse through both lists while neither is empty
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next; // Advance list2
            } else {
                curr.next = list1;
                list1 = list1.next; // Advance list1
            }
            curr = curr.next; // Move the merged list pointer forward
        }

        // Attach whatever remaining elements are left in list1 or list2
        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }

        // Return the head of the merged list (skipping dummy node)
        return dummy.next;
    }
}