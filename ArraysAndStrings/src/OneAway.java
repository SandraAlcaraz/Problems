public class OneAway {
    // There are three types of edits that can be performed on strings:
    //insert a character,
    //remove a character
    //or replace a character
    //Given two strings
    //Write a function to check if they are one edit (or zero edits) away.

    //EXAMPLE
    //pale, ple ->true
    //pales, pale -> true
    //pale, bale ->true
    //pale, bake -> false

    public static boolean remove(String a , String b){
        int contador= 0;
        for(int i=0;i<b.length();i++){
            if(a.charAt(i+contador)!=b.charAt(i)){
              contador++;
            }
        }
        if(contador==1){
            return true;
        }

        return false;
    }
    public static boolean insert(String a , String b){
        int contador= 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i+contador)){
                contador++;
            }
        }
        if(contador==1){
            return true;
        }

        return false;
    }
    public static boolean replace(String a , String b){
        int contador= 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                contador++;
            }
        }
        if(contador==1){
            return true;
        }

        return false;
    }


    public static boolean  oneAwayMethod(String a , String b){
        if(b.length()<a.length()){
            System.out.println("remove");
            return remove(a, b);
        }
        if(b.length()>a.length()){
            System.out.println("insert");
            return insert(a, b);
        }
        if(b.length()==a.length()){
            System.out.println("replace");
            return replace(a,b);
        }
        return false;
    }


    public static void main(String args []){


        System.out.println( oneAwayMethod("pale", "ple"));
       System.out.println( oneAwayMethod("pale", "pales"));
        System.out.println( oneAwayMethod("pale", "bale"));
        System.out.println( oneAwayMethod("pale", "bake"));

    }



}
