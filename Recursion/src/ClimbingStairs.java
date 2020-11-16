import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private static HashMap<Integer, Integer> map ;

    public static int climbStairs(int n) {
        map  = new HashMap<>();
        if(n==0|| n==1) return n;
        return helper(n, 0);
    }

    public static int helper(int n, int step){
        if(step==n){
            return 1;
        }
        if (step>n){
            return 0;
        }
        if(map.containsKey(step))return map.get(step);
        map.put(step, helper(n, step+1)+ helper(n,step+2));
        return map.get(step);
    }

    public static void main (String [] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(1));
    }


}
