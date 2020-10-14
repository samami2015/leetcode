package com.od.self;

import java.util.HashSet;
import java.util.Set;

public class Self_LC0142_001 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }
        return null;
    }
}
