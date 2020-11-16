import java.lang.reflect.Array;

public class URLify {

    //Write a method to replace all spaces in a string with '%20'.
    //You may assume that the string has sufficient space at the end to hold the additional characters,
    //and that you are given the "true" length of the String.


    public static void replaceSpaces(char[] str, int trueLength){
        int spaces= 0;
        int index=0;
       for(int i=0; i<trueLength;i ++){
           if(str[i]==' '){
               spaces++;
           }
       }
       index=trueLength+(spaces*2);
       if(trueLength<str.length){
           str[trueLength]='\0'; //If you write '\0' to position n of a NUL-terminated string, you will cut off everything after the first n characters,
       }
       for (int i=trueLength -1; i>=0;i--){
           if(str[i]==' '){
               str[index-1]='0';
               str[index-2]='2';
               str[index-3]='%';
               index=index-3;
           }
           else{
               str[index-1]=str[i];
               index--;
           }
       }
       for(char c: str){
           System.out.print(c);
       }



    }

    public static void main(String args []){

        char [] a= new char[17];
        a[0]='M';
        a[1]='r';
        a[2]=' ';
        a[3]='J';
        a[4]='o';
        a[5]='h';
        a[6]='n';
        a[7]=' ';
        a[8]='S';
        a[9]='m';
        a[10]='i';
        a[11]='t';
        a[12]='h';
        a[13]=' ';
        a[14]=' ';
        a[15]=' ';
        a[16]=' ';
        replaceSpaces(a,13);

        char [] b= new char[13];
        b[0]='T';
        b[1]='h';
        b[2]='i';
        b[3]='s';
        b[4]=' ';
        b[5]='L';
        b[6]='o';
        b[7]='v';
        b[8]='e';
        b[9]=' ';
        b[10]=' ';
        b[11]=' ';
        b[12]=' ';
       // replaceSpaces(b,9);


    }

}
