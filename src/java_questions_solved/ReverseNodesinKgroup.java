package java_questions_solved;

import java.util.LinkedList;

public class ReverseNodesinKgroup {
    public static void main(String[] args) {
        LinkedList<> array= [1, 2, 3, 4, 5];
        int k=2;
        System.out.println(ListNode.reverseNodesinKgroup(array));
    }
}

class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode endhead = new ListNode(4,head);
        ListNode prev = endhead;
        while(head!=null) {
            ListNode end = findEnd(prev.next,k);
            if(end == prev.next)return endhead.next;
            prev = reverse(prev,end);
            head = prev;
        }
        return endhead.next;
    }
    private  static ListNode reverse(ListNode crr, ListNode end) {
        ListNode atend = end;
        ListNode curr = crr;
        crr = crr.next;
        ListNode res = crr;
        ListNode nex;
        while(crr != atend) {
            nex = crr.next;
            crr.next = end;
            end = crr;
            crr = nex;
        }
        curr.next = end;
        return res;
    }
    private static ListNode findEnd(ListNode head, int k) {
        if(head == null )return head;
        ListNode head1 = head;
        head = head.next;
        for(int i = 1 ; i < k ; i++) {
            if(head == null) {
                return head1;
            }
            head = head.next;
        }
        return head;
    }
}
