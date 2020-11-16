public class StringCompression {

    public static StringBuilder compression(String str){
        StringBuilder stringBuilder= new StringBuilder();
        int contador=0;
        for(int i=0;i<str.length();i++) {
            contador++;
            if(i+1>=str.length()|| str.charAt(i)!=str.charAt(i+1)){
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(contador);
                contador=0;
            }
        }
        if(stringBuilder.length()>str.length()){
            return new StringBuilder(str);
        }
        return stringBuilder;
    }

    public static void main(String args []){

        System.out.println( compression("aabcccccaaa"));
        System.out.println( compression("hhhhhhhahahaaaaaaaaaaha"));
        System.out.println( compression("nso"));
        System.out.println( compression("onso"));

    }
}
