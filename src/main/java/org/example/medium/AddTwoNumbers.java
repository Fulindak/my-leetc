package org.example.medium;

import org.example.util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int unit = 0;

        while(l1 != null || l2!= null || unit != 0) {
            int firstN = (l1 != null) ? l1.val : 0;
            int secondN = (l2 != null) ? l2.val : 0;
            curr.next = new ListNode((firstN + secondN + unit) % 10);
            unit = (firstN + secondN + unit) / 10;
            curr = curr.next;
            if (l1 != null ) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result.next;
    }
}
