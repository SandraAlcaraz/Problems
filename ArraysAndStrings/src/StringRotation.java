public class StringRotation {


    public static boolean stringRotate(String original, String rotate){
        if(original.length()!=rotate.length()&& original.length()>0){
            return false;
        }

        String original2= original+original;

        return original2.contains( rotate);

    }

    public static void main(String args []){

        System.out.println(stringRotate("waterbottle", "erbottlewat"));
        System.out.println(stringRotate("wat", "ter"));
    }

}
