import java.util.Arrays;

public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] A, int K) {

        Arrays.sort(A);
        int left=0, right= A.length-1, sum, lastSum;
        lastSum=-1;
        while(left<right){
            sum=A[left]+A[right];
            if(sum < K){
                lastSum=Math.max(lastSum, sum);
                left++;
            }else {
                right--;
            }

        }

        return lastSum;
    }
}
