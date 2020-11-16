import java.util.ArrayList;
import java.util.List;

public class SugestionsSys {

    public static class Trie{
        Trie [] nextNode;
        List<String> words;
        public Trie(){
            words= new ArrayList<>();
            nextNode=new Trie[26];
        }

        public void insertProducts(String [] products, Trie root){
            Trie trie;
            for(String e: products){
                trie=root;
                    for(int i =0; i<e.length();i++){
                        char c= e.charAt(i);
                        int index=c-'a';
                        if (trie.nextNode[index] == null) {
                            trie.nextNode[index] = new Trie();
                        }
                        trie= trie.nextNode[index];
                       if(trie.words.size()<3){
                           trie.words.add(e);
                       }
                    }
                }
            }
        }

    public List<List<String>> searchWord(){
        List<List<String>> res = new ArrayList();


        return  new ArrayList();

        }


    public static ArrayList<List<String>> searchSuggestions(String searchWord, String [] products){
        Trie root= new Trie();
        root.insertProducts(products, root);




        return new ArrayList<>();
    }


    public static void main(String args[]){
        String products1[] = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord1="mouse";
        ArrayList<List<String>> arrayList= searchSuggestions(searchWord1, products1);


    }
}
