import java.util.ArrayList;
import java.util.List;

public class KthSymbolGrammar {

    public  static int kthGrammar(int N, int K) {
        return helper(N-1, 0);
    }
    public static int helper(int N, int K){
        if(N==0) return K;
        int prevK= (K==0) ? 1 : 0;
        return helper(N-1, prevK);
    }


        public int binarySearch(int[] nums, int target){
            List<List<Integer>> list= new ArrayList();
            if(nums == null || nums.length == 0)
                return -1;

            int left = 0, right = nums.length - 1;
            while(left <= right){
                // Prevent (left + right) overflow
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){ return mid; }
                else if(nums[mid] < target) { left = mid + 1; }
                else { right = mid - 1; }
            }

            // End Condition: left > right
            return -1;
        }


    public static void main(String args []){

    }
}
