import java.util.Stack;

public class AddTwoNumbers {

// int fal=0;
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode head= helper(l1, l2);
//        if(fal!=0){
//            ListNode curr = new ListNode(fal);
//            curr.next = head;
//            head = curr;
//        }
//        return head;
//    }
//     public ListNode helper(ListNode l1, ListNode l2) {
//        if(l1.next==null&& l2.next==null){
//            int value= l1.val+l2.val;
//            return new ListNode(value);
//        }
//        ListNode nl1= l1;
//        ListNode nl2= l2;
//
//        if(l1.next!=null) {
//            nl1= l1.next;
//        }
//        if(l2.next!=null) {
//            nl2= l2.next;
//        }
//        ListNode actual= new ListNode(0);
//        actual.next=helper(nl1, nl2);
//
//        int value= l1.val+l2.val+fal;
//        fal= (int)Math.floor(value/10.0);
//        value= value%10;
//        actual.val= value;
//
//        return actual;
//    }


        int fal = 0;
        Stack<Integer> stack1= new Stack();
      Stack<Integer> stack2= new Stack();

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = helper(l1, l2);
            if(head.val==0){
                head=head.next;
            }
            return head;
        }


    public ListNode helper(ListNode l1, ListNode l2) {

        if (l1 == null && l2==null) {
            int val =stack1.pop()+ stack2.pop();
            fal = (int) (val / 10.0);
            val = val % 10;
            return new ListNode(val);
        }
        if(l2!=null){
            stack2.push(l2.val);
            l2= l2.next;
        }
        if(l1!=null){
            stack1.push(l1.val);
            l1= l1.next;
        }

        ListNode actual = new ListNode();
        actual.next= helper(l1, l2);
        int value=0;

        if(!stack2.empty()&&!stack1.empty()){
            value = stack1.pop() + stack2.pop() + fal;
        }
        else if(!stack1.empty()){
            value =  stack1.pop() + fal;
        }
        else if(!stack2.empty()){
            value =  stack2.pop() + fal;
        }
        else if(stack2.empty()&& stack1.empty()){
            value =  fal;
        }
        fal = (int) (value / 10.0);
        value = value % 10;
        actual.val = value;
        return actual;
    }



        public ListNode helper5(ListNode l1, ListNode l2) {
            if (l1.next == null && l2.next == null) {
                int value = l1.val + l2.val;
                return new ListNode(value);
            }
            ListNode nl1 = l1;
            ListNode nl2 = l2;

            if (l1.next != null) {
                nl1 = l1.next;
            }
            if (l2.next != null) {
                nl2 = l2.next;
            }
            ListNode actual = new ListNode(0);
            actual.next = helper5(nl1, nl2);
            System.out.println(nl1.val);
            System.out.println(nl2.val);
            System.out.println(fal);
            System.out.println();
            int value = nl1.val + nl2.val + fal;
            fal = (int) Math.floor(value / 10.0);
            value = value % 10;
            actual.val = value;

            return actual;
        }

        public static void main(String[] args) {

            ListNode a = new ListNode(7);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(4);
            ListNode d = new ListNode(3);
            a.next = b;
            b.next = c;
            c.next = d;


            ListNode e = new ListNode(5);
            ListNode f = new ListNode(6);
            ListNode g = new ListNode(4);
            e.next = f;
            f.next = g;

            AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

            ListNode ax = addTwoNumbers.addTwoNumbers(a, e);
            System.out.println(ax);

            ListNode ex = new ListNode(8);
            ListNode fx = new ListNode(5);
            ListNode agx = addTwoNumbers.addTwoNumbers(ex, fx);
            System.out.println(agx);

        }
    }



