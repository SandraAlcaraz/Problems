public class Pow {

    private static double actual;

    public static double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0){
            x=1/x;
            n=-n;
        }
         actual=x;
        return  pow(x, n);

    }

    public static double pow(double x, long n) {
        if(n==1) return  actual;

         actual= pow(x, n/2);
        if(n%2==0){
            return  actual*actual;
        }else{
            return actual*actual*x;
        }
    }
    public static int sumResult(int[] nums, int count ){

        int sum=0;
        float c= count;
        for(int e: nums){
            sum+=Math.ceil(e/c);
        }
        return sum;
    }

    public class ListNode {
     int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    int fal=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.next==null&& l2.next==null){
            int value= l1.val+l2.val;
            return new ListNode(value);
        }
        ListNode nl1= l1;
        ListNode nl2= l2;

        if(l1!=null) {
            nl1= l1.next;
        }
        if(l2!=null) {
            nl2= l2.next;
        }
        ListNode actual= new ListNode(0);
        actual.next=addTwoNumbers(nl1, nl2);

        int value= l1.val+l2.val+fal;
        fal= (int) Math.floor(value/10.0);
        value= value%10;
        actual.val= value;
        return actual;
    }

    public static void main (String [] args) {







        System.out.println(myPow(2,2));
        System.out.println(myPow(9,3));
        System.out.println(myPow(2,-2));

        System.out.println(myPow(0.44528,0));
        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(5/2);
        int a[]= {1,2,5,9};
        System.out.println(sumResult(a, 5));
    }

}
