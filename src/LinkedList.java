class Linkedlist{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add-first, last
    public void addFisrt(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newnode;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"->");
            curnode=curnode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.addFisrt("am");
        list.addFisrt("I");
        list.addLast("student");
        list.printList();
    }
}