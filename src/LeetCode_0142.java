import java.util.ArrayList;
import java.util.List;

public class LeetCode_0142 {
    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        // A fast pointer will either loop around a cycle and meet the slow
        // pointer or reach the `null` at the end of a non-cyclic list.
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                return tortoise;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        // If there is a cycle, the fast/slow pointers will intersect at some
        // node. Otherwise, there is no cycle, so we cannot find an e***ance to
        // a cycle.
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }
        // To find the e***ance to the cycle, we have two pointers traverse at
        // the same speed -- one from the front of the list, and the other from
        // the point of intersection.
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    public static void main(String[] args) {
        LeetCode_0142 solution = new LeetCode_0142();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        int pos = 1;
        ListNode node = solution.detectCycle(listNode1);
        List nodes = new ArrayList<ListNode>();
        nodes.add(0,listNode1);
        nodes.add(1,listNode2);
        nodes.add(2,listNode3);
        nodes.add(3,listNode4);
        ListNode temp = (ListNode)nodes.get(pos);
        System.out.println(node.val==temp.val?"tail connects to node index "+pos:"no cycle");
    }
}
