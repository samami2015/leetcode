package com.od.self;

import java.util.List;

public class Self_LC0206_001 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        int count = 1;
        while (node.next != null) {
            count++;
            node = node.next;
        }
        ListNode[] nodes = new ListNode[count];
        node = head;
        for (int i = count-1; count >= 0; i--) {
            if (node.next != null) {
                nodes[i] = node;
                node = node.next;
            }else{
                nodes[i]=node;
                node.next =null;
                break;
            }
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        Self_LC0206_001 solution = new Self_LC0206_001();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode tail = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = tail;

        System.out.println(solution.reverseList(head).val);
    }
}
