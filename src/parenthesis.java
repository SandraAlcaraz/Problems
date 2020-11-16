import java.util.Stack;
public class parenthesis {


    public static  Boolean verifica(String str){
        Stack stackStr= new Stack();
        for(int n=0; n<str.length();n++ ){
            char c = str.charAt (n);
            if(c==')'&&stackStr.empty()){
                System.out.println("incorrecto");
                return false;
            }
            else if(c=='('){
                stackStr.push('(');
                continue;
            }
            else if(c==')'&&!stackStr.empty()){
                stackStr.pop();
            }
        }
        if(stackStr.empty()){
            System.out.println("correcto");
            return true;
        }else{
            System.out.println("incorrecto");
            return false;
        }
    }

    public static void main (String [] args){
        String balanced= "((()))";
        verifica(balanced);
        String notBalanced= "))((";
        verifica(notBalanced);
        String noBalanced="(()))";
        verifica(noBalanced);
        String nb= "(()())";
        verifica(nb);
        String gh= "()())";
        verifica(gh);
        String hg= ")()";
        verifica(hg);

    }
}
