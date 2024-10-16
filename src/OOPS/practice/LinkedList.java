package OOPS.practice;

import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(-4);
        head.next.next.next.next=new Node(2);
//
//        head.next.next.next.next.next=head;


        //reverse LinkedList
//        head=reverseLL(head);
//        System.out.println("The reverse LL is:");
//        printList(head);

//        //Cycle/loop detection
//        if(detectLoop1(head)){
//            System.out.println("Loop Exists");
//        }else{
//            System.out.println("Loop Not Exists");
//        }

        System.out.println(middleNode(head).data);
    }



    //method 1 to detect loop
    private static boolean detectLoop(Node head) {
        HashSet<Node> set=new HashSet<>();

        while(head!= null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }

    //method 2 to detect loop
    private static boolean detectLoop1(Node head) {
        if(head==null || head.next==null) return false;

        Node slow=head;
        Node fast=head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null) return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }

    //middle of LL
    public static Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    //method to reverse LL
    private static Node reverseLL(Node head) {
        Node prev=null;
        Node curr=head;

        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    private static void printList(Node head) {
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }

}