package com.od.self;

public class Self_LC0206_003 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        Self_LC0206_003 solution = new Self_LC0206_003();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        System.out.println(listNode1.val + "->" + listNode1.next.val + "->" + listNode1.next.next.val + "->" + listNode1.next.next.next.val + "->" + listNode1.next.next.next.next.val);
        listNode1 = solution.reverseList(listNode1);
        System.out.println(listNode1.val + "->" + listNode1.next.val + "->" + listNode1.next.next.val + "->" + listNode1.next.next.next.val + "->" + listNode1.next.next.next.next.val);
    }
}
