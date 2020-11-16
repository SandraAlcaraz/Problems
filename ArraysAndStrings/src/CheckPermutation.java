public class CheckPermutation {
    //Given two strings, write a method to decide if one is a permutation of other

   public static String sort(String string){
        char[] content =string.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

   public static boolean permutation(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        return sort(string1).equals(sort(string2));

    }

    public static void main(String args []){

        System.out.println( permutation("home", "meho"));
        System.out.println( permutation("ha", "ho"));
        System.out.println( permutation("aha", "ho"));
    }
}
