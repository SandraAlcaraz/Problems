public class Node {
    int data;
    Node next=null;

    public Node(int data){
        this.data=data;
    }

    public void appendToTail(int data){
        Node end= new Node(data);
        Node actualNode=this;
        while (actualNode.next!=null){
            actualNode=actualNode.next;
        }
        actualNode.next=end;
    }



    public Node deleteNode(Node head, int data){
        //we always return the head of the Linked list.
        Node node= head;
        if (node.data==data){
            return head.next; //only in this case the head changes.
        }
        while (node.next!=null){
            if(node.next.data==data){
                node.next=node.next.next;
                return head;
            }
            node=node.next;
        }
        return head; //If we do not find the data inside the Linked list, we do not do nothing
    }

    public String toString() {
        String result = "";
        Node current = this;
        while(current.next != null){
            result += current.data;
            if(current.next != null){
                result += ", ";
            }
            current = current.next;
        }
        result+=current.data +", ";
        return "List: " + result;
    }




}
