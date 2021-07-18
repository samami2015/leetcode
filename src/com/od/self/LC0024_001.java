package com.od.self;

public class LC0024_001 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;
        return secondNode;
    }

    public static void main(String[] args) {
        LC0024_001 solution = new LC0024_001();
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
