public class IsUnique {
    // Implement and algorithm to determine if a string has all unique characters.
    //What if you can not use additional data structures

    public static boolean isUniqueChars(String string){
        //hashtable
        if(string.length()>128){
            return false;
        }
        boolean[] char_set= new boolean[128];
        for(int i=0; i<string.length(); i++){
            int value=string.charAt(i);
            if (char_set[value]) {
                return false;
            }
            char_set[value]=true;
        }
        return true;
    }

    public static boolean isUniqueChars2(String string){
        //bit vector
        int checker=0;
        for(int i=0; i<string.length(); i++){
           int val=string.charAt(i)-'a';
           if((checker&(1<<val))>0){
               return false;
           }
           checker|=(1<<val);
        }

        return true;
    }




    public static void main(String args []){

        System.out.println( isUniqueChars("home"));
        System.out.println( isUniqueChars("hahahaha"));
    }
}
