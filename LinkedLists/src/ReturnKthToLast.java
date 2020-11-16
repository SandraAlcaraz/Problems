public class ReturnKthToLast {

//Approach Recursive
    // Do not Return the element

    public  int printKthToLast(Node h, int k){
        if(h==null){
            return 0;
        }

        int index= printKthToLast(h.next, k)+1;
        if(index==k){
            System.out.println(k+"th to last node is"+  h.data);
        }
        return index;
    }

    //Recursive Create a wrapper Class
    class Index{
        public int value=0;
    }

    public Node KthToLast(Node head, int k){
        Index idx =new Index();
        return kthToLast(head,k,idx);
    }

    public Node kthToLast(Node head, int k, Index idx){
        if(head==null){
            return null;
        }

        Node node= kthToLast(head.next, k,idx );
        idx.value=idx.value+1;
        //vamos sumando uno al valor
        // hasta que encontremos de atras a adelante el valor de K
        if(idx.value==k){
            return head;
        }
        return node;
    }

    //Iterative
    public Node nthToLast(Node head, int k){
        Node p1=head;
        Node p2= head;
        //Move p1 k nodes into the list
        for(int i=0; i<k; i++){
            if(p1==null) return null;
            p1=p1.next;
        }

        //Move them at the same pace.
        // When p1 hits the end, p2 will be at the right element.
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;


    }



}
