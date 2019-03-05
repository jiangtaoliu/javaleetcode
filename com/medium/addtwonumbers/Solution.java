package com.medium.addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        int carry = 0;
        while (p != null || q!=null) {
            int x = (p!=null)?p.val:0;
            int y = (q!=null)?q.val:0;
            int sum = carry + x + y;
            carry = sum/10;
            System.out.println(x);
            System.out.println(y);
            System.out.println(sum);
            System.out.println(carry);
            curr.next = new ListNode(sum%10);
            System.out.println(curr.next.val);
            curr = curr.next;
            System.out.println(curr.val);
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
            System.out.println("====================");
        }
        if (carry >0) {
            curr.next = new ListNode(carry);
            System.out.println("+++"+curr.next.val);
        }
        return result.next;
    }
}