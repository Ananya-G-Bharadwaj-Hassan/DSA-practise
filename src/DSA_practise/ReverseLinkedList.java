import java.util.LinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode node=null;

        while(head!=null){
            ListNode temp=head.next;
            head.next=node;
            node=head;
            head=temp;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList obj = new ReverseLinkedList();

        // Reverse linked list
        head = obj.reverseList(head);

        // Print reversed linked list
        System.out.println("Reversed Linked List:");

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}