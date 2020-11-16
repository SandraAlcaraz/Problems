public class DeleteMiddleNode {


    public static Node deleteMiddle( Node head){
        if(head==null){
            return null;
        }
        Node runner= head;
        Node middle= head;
        int contador=-1;
        while (runner.next!=null){
            contador++;
            runner=runner.next.next;
        }

        int x=0;
        while (x<contador){
            middle=middle.next;
            x++;
        }
        middle.next=middle.next.next;

        return head;
    }

    public static void main (String [] args) {
        Node list = new Node(2);
        list.appendToTail(2);
        list.appendToTail(1);
        list.appendToTail(3);
        list.appendToTail(5);
        list.appendToTail(1);
        list.appendToTail(1);
        System.out.println(list.toString());
        System.out.println(deleteMiddle(list));


        Node list2 = new Node(2);
        list2.appendToTail(2);
        list2.appendToTail(1);
        list2.appendToTail(3);
        list2.appendToTail(5);
        list2.appendToTail(1);
        list2.appendToTail(1);
        System.out.println(deleteMiddle(list2));
       // deleteMiddle(list);

    }
}
