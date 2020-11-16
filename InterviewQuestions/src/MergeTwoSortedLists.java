public class MergeTwoSortedLists {
    //Merge two sorted linked lists and return it as a new list.
    // The new list should be made by splicing together the nodes of the first two lists.
    //Example:
    //
    //Input: 1->2->4, 1->3->4
    //Output: 1->1->2->3->4->4


    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

        public void appendToTail(int data) {
            Node end = new Node(data);
            Node actualNode = this;
            while (actualNode.next != null) {
                actualNode = actualNode.next;
            }
            actualNode.next = end;
        }
        void printList() {
            Node temp = this;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static Node mergeLists(Node list1, Node list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        if(list1.data<list2.data){
            list1.next=mergeLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next=mergeLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String args[]){
        Node llist1 = new Node(5);
        llist1.appendToTail(10);
        llist1.appendToTail(15);

        Node llist2 = new Node(2);
        llist2.appendToTail(3);
        llist2.appendToTail(20);

        Node n=   mergeLists( llist1, llist2 );
        n.printList();


        Node llist3 = new Node(1);
        llist3.appendToTail(2);
        llist3.appendToTail(4);

        Node llist4 = new Node(1);
        llist4.appendToTail(3);
        llist4.appendToTail(4);



        Node n2=   mergeLists( llist3, llist4 );
        n2.printList();

        System.out.println( 'a'-'a');

    }


}




