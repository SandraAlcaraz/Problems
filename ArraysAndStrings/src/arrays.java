import java.util.*;


public class arrays {

    public static int findNumbers(int[] nums) {
        int times=0;
        for(int i=0;i<nums.length; i++){
            String  a= String.valueOf(nums[i]);
            if(a.length()%2==0){
                times++;
            }
        }

      return times;
    }

    public static int[] sortedSquares(int[] A) {
        int []  squares = new int [A.length];
        for(int i=0;i<A.length;i++){
            squares[i]=A[i]*A[i];
        }

         Arrays.sort(squares);
        return squares;
    }

    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1; j>i+1;j--){
                    arr[j]=arr[j-1];
                }
                if(i+1<arr.length) arr[i+1]=0;
                i++;
            }
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            m=1;
            nums1=nums2;
        }
        for (int pf=nums1.length-1 ; pf>0;pf--){
            if(nums2[n-1]>nums1[m-1]){
                nums1[pf]=nums2[n-1];
                n--;
            }else{
                nums1[pf]=nums1[m-1];
                m--;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }


    public static int removeElement(int[] nums, int val) {

        int len=nums.length;
        for(int p=0;p<len;p++){
            if(nums[p]==val){
                for(int i=0;i<len-1;i++){
                    if(p+i+1<nums.length) nums[p+i]=nums[p+1+i];
                }
                nums[len-1]=0;

                p--;
                len--;
            }
        }
        return len;
    }
    public static int removeDuplicates(int[] nums) {
        int kdup=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]) {
                nums[kdup]=nums[i+1];
                kdup++;
            }}

        return kdup;

    }


    public static int removeElementD(int[] nums, int val) {

        int len=nums.length;
        for(int p=0;p<len;p++){
            if(nums[p]==val){
                for(int i=0;i<len-1;i++){
                    if(p+i+1<nums.length) nums[p+i]=nums[p+1+i];
                }
                nums[len-1]=0;

                p--;
                len--;
            }
        }
        return len;
    }

    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);


        for(int i=0; i<arr.length;i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[i]*2==arr[j]){
                    System.out.println(arr[i]+" "+ arr[j]);
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int len=A.length;
        int count=0;

        while(count<len&&A[count]<A[count+1]){
            System.out.println("hehe");
            count++;
        }
        if(A[count+1]==A[count] || count==len){
            System.out.println("noou");
            return false;
        }
        while (count<len&&A[count]>A[count+1]){
            System.out.println("noo");
            count++;
        }

        return count==len;

    }

    public static int[] replaceElements(int[] arr) {
        if(arr.length==0) return  arr;
        int len=arr.length;
        int max=arr[len-1];
        arr[len-1]=-1;
        int temp;

        for(int i=len-2;i>=0;i--){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
                arr[i]=temp;
            }else{
                arr[i]=max;
            }
        }
        return  arr;
    }


    public static void moveZeroes(int[] nums) {
        int zeros=0;
        int write=0;
        for( int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                nums[write]=nums[r];
                write++;

            }else{
                zeros++;
            }
        }
        while(write<nums.length){
            nums[write]=0;
            write++;
        }

    }


    public int thirdMax(int[] nums) {
        Set<Integer> setlist =new HashSet();
        for(int a: nums) setlist.add(a);

        if(setlist.size()<3) return Collections.max(setlist);

        setlist.remove(Collections.max(setlist));
        setlist.remove(Collections.max(setlist));


        return Collections.max(setlist);

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length==0) return new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> set= new HashSet<>();
        for(int a: nums) set.add(a);

        for(int i=1; i<=nums.length;i++){
            if(!set.contains(i)){
               list.add(i) ;
            }
        }
        return list;
    }


    public static void main(String args []){

        int [] df={0,1,0,3,12};
        int [] dx={3,1,0,0,2,4,0};
       //  moveZeroes(dx);
         int [] da={4,3,2,7,8,2,3,1};
         System.out.println(findDisappearedNumbers(da));


    }
}
