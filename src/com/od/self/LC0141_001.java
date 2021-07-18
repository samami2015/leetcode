package com.od.self;

import java.util.HashSet;
import java.util.Set;

public class LC0141_001 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LC0141_001 solution = new LC0141_001();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        int pos;
        boolean ret = solution.hasCycle(listNode1);
        System.out.println(ret);
    }
}
