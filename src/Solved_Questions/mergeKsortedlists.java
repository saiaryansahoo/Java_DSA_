package Solved_Questions;

import java.util.*;

public class mergeKsortedlists {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            while (list != null) {
                pq.add(list.val);
                list = list.next;
            }
        }

        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while (!pq.isEmpty()) {
            curr.next = new ListNode(pq.remove());
            curr = curr.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode[] lists = new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode mergedHead = mergeKsortedlists.mergeKLists(lists);

        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
