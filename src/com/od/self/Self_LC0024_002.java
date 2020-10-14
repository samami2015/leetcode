package com.od.self;

public class Self_LC0024_002 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevNode = dummy;
        while (head != null && head.next != null) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            prevNode = firstNode;
            head = firstNode.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Self_LC0024_002 solution = new Self_LC0024_002();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        System.out.println(listNode1.val + "->" + listNode1.next.val + "->" + listNode1.next.next.val + "->" + listNode1.next.next.next.val);
        listNode1 = solution.swapPairs(listNode1);
        System.out.println(listNode1.val + "->" + listNode1.next.val + "->" + listNode1.next.next.val + "->" + listNode1.next.next.next.val);
    }
}
