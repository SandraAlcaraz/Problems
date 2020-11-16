

public class Palindrome {
    public boolean  isPalindrome(Node head) {
        Node reversed= reverseAndClone(head);
       return isEqual(head, reversed);
    }

    Node reverseAndClone(Node node){
        Node head=null;
        while (node!=null){
            Node n= new Node(node.data);
            n.next=head;
            head=n;
            node=node.next;
        }
        return head;
    }





    boolean isEqual(Node one, Node two){
        while (one!=null&& two!=null){
            if(one.data!=two.data){
                return false;
            }
            one=one.next;
            two=two.next;
        }
        return one==null&&two==null;
    }

    public Node  insertHead(int data, Node head){
        int lastData= head.data;
        Node a= new Node(data);
        a.appendToTail(lastData);
        return  a;
    }


}

