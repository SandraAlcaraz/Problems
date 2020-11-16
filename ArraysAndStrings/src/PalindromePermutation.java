import java.util.ArrayList;
import java.util.HashMap;

public class PalindromePermutation {
    //Given a string , write a function to check if it is a permutation of palindrome.
    //The palindrome does not need to be limited to just dictionary of words.

    public static int[] buildCharFrecuencyTable(String string){
        return  new int[2];
    }


    public static boolean isPalindromePermutation(String string){
        HashMap <Integer, Integer> hashMap= new HashMap();
        ArrayList arrayList= new ArrayList();
        int value;
        for(int i=0; i<string.length();i++){
            value=string.charAt(i);
            if(hashMap.containsKey(value)){
                hashMap.put(value, hashMap.get(value)+1);
            }
            else{
                hashMap.put(value, 1);
                arrayList.add(value);
            }
        }
        boolean number= false;
        for (int i=0;i<hashMap.size();i++){
            if(hashMap.get(arrayList.get(i))%2==1){
                if(number){
                    return false;
                }
                else{
                    number=true;
                }
            }
        }

        return true;
    }

    public static void main(String args []){

        System.out.println( isPalindromePermutation("aha"));
        System.out.println( isPalindromePermutation("hahahaha"));
        System.out.println( isPalindromePermutation("nso"));
        System.out.println( isPalindromePermutation("onso"));

    }
}
