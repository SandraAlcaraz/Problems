public class RemoveDups {


    public static void removeDump(Node a){
        Node current =a;

        while (current!=null){
            Node runner=current;
            while (runner.next!=null){
                if(runner.next.data==current.data){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }

            }
            current=current.next;
        }

        System.out.println(a.toString());

    }

    public static void main (String [] args){
        Node list = new Node(2);
        list.appendToTail(2);
        list.appendToTail(1);
        list.appendToTail(3);
        list.appendToTail(5);
        list.appendToTail(1);
        list.appendToTail(1);
        System.out.println(list.toString());
        removeDump(list);

    }



}
