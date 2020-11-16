import com.sun.javafx.collections.SetListenerHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CopyList {


    public static class Node {
        int val;
        Node next;
        Node random;
        public Node(int data){
            this.val=data;
            this.next=null;
            this.random=null;
        }
        public Node(){

        }

    }
        public static Node copyRandomList(Node head){
            if(head==null){
                return null;
            }
            HashMap<Node, Node> map= new HashMap<>();
            Node temporal= head;
            while (temporal!=null){
                Node node= new Node(temporal.val);
                map.put(temporal,node);
                temporal=temporal.next;

            }
            temporal=head;
            while(temporal!=null){
                if(temporal.next!=null){
                    map.get(temporal).next=map.get(temporal.next);
                }
                if(temporal.random!=null){
                    map.get(temporal).random=map.get(temporal.random);
                }
                temporal=temporal.next;
            }

            return map.get(head);
        }




        public static void main(String args []){

        Node head= new Node( );


    }
}
