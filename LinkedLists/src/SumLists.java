public class SumLists {

    public static int listLength(Node list){
        if(list==null) return 0;
        int counter= 0;
        while (list!=null){
            counter+=1;
            list=list.next;
        }
        return counter;
    }


    public static Node appendLastNodes(Node newNodeList, Node rest, int r){
        if(rest==null || newNodeList==null){
            return newNodeList;
        }
        while(rest!=null){
            System.out.println(rest.data+r);
            newNodeList.appendToTail(rest.data+r);
            rest=rest.next;
            r=0;
        }
        return newNodeList;
    }



    public static Node sumList1(Node list1, Node list2){
        if(list1==null|| list2==null){
            return null;
        }
        int l1Length= listLength(list1);
        int l2Length= listLength(list2);
        int times;
        boolean l1;
        if(l1Length>l2Length){
            l1=true;
            times=l2Length;
        }
        else{
            l1=false;
            times=l1Length;
        }
        Node newList= new Node(0);
        int res;
        int result;
        int part2ofR=0;
        for(int i=0; i<times;i++){
            if(list1==null|| list2==null) break;
            res=list1.data+list2.data+part2ofR;
            result=(res)%10;
            part2ofR=(res-result)/10;
            newList.appendToTail(result);
            list1=list1.next;
            list2=list2.next;
        }
        if(l1){
            System.out.println("hi");
            return appendLastNodes(newList, list1, part2ofR);
        }else{
            System.out.println("ho");
            return appendLastNodes(newList,list2,part2ofR);
        }

    }

    public static void main (String [] args) {
        Node list = new Node(2);

        list.appendToTail(8);

        list.appendToTail(1);
        list.appendToTail(3);
        list.appendToTail(5);
        list.appendToTail(1);
        list.appendToTail(9);
        list.appendToTail(5);
        list.appendToTail(8);
        System.out.println(list.toString());
      //  System.out.println(listLength(list));


        Node list2 = new Node(9);

        list2.appendToTail(2);

        list2.appendToTail(1);
        list2.appendToTail(3);
        list2.appendToTail(7);
        list2.appendToTail(1);
        list2.appendToTail(1);

        System.out.println(sumList1(list,list2));
    }
    }
