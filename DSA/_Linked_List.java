package DSA301;

import java.util.LinkedList;
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}

public class _Linked_List {
    public static void main(String[] args) {
        int[] head = {1, 2, 2, 1};
        for (int h: head) {
            detectPalindrome(new Node1(h));

        }

    }
    public static boolean detectPalindrome(Node1 a){
        //complete this function.
        if(a == null || a.next == null){
            return true;
        }


        Node1 slow = a;
        Node1 fast = a;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node1 curr = slow.next;
        Node1 prev = null;
        while(curr != null){
            Node1 temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        fast = prev;
        slow = a;
        int i=0;
        while(slow != null && fast != null){
            if (slow.data != fast.data){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
            i++;
        }

        return true;
    }
}

