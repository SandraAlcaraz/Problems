public class Partition {


    public static Node partition(Node node, int x){
        Node head=node;
        Node tail=node;

        while(node!=null){
            Node next= node.next;
            if(node.data<x){
                //insert  node at head
                node.next=head;
                System.out.println("node next "+ node.next.data);
                head=node;
                System.out.println(head.data);
            }
            else{
                //insert node at tail
                tail.next=node;
                tail=node;
            }
            node=next;
        }
        tail.next=null;

        return head;
    }

    public static void main (String [] args) {
        Node list = new Node(2);
        list.appendToTail(6);
        list.appendToTail(8);
        list.appendToTail(1);
        list.appendToTail(4);
        list.appendToTail(7);
        list.appendToTail(5);
        list.appendToTail(3);
        list.appendToTail(1);
        list.appendToTail(9);

        System.out.println(list.toString());
        System.out.println(partition(list, 5));
    }
    }
