public class LC0206 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LC0206 solution = new LC0206();
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