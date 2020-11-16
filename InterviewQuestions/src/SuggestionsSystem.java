public class SuggestionsSystem {

    //Given an array of strings products and a string searchWord.
    // We want to design a system that suggests at most three product names from products after each character of searchWord is typed.
    // Suggested products should have common prefix with the searchWord.
    // If there are more than three products with a common prefix return the three lexicographically minimums products.
    //
    //Return list of lists of the suggested products after each character of searchWord is typed.

  int ALPHABET_SIZE = 26;

    public static class TrieNode{
        TrieNode []child;
        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord = false;
            child= new TrieNode[26];
        }
    }
    public static class TrieTree{
        private TrieNode root;

        public TrieTree(){
            root= new TrieNode();
        }

        public  void insertWord(String word){
            TrieNode actual= root;
            TrieNode temp;
            for(int i =0; i<word.length();i++){
                char c= word.charAt(i);
                int index=c-'a';
                if(actual.child[index]==null){
                    temp = new TrieNode();
                    actual.child[index]=temp;
                }else{
                    actual=actual.child[index];
                }
            }
            actual.isEndOfWord=true;
        }

        public TrieNode searchNode(String word){
            TrieNode actual= root;
            char c;
            for(int i=0;i<word.length(); i++){
                c= word.charAt(0);
                int index = c-'a';
                if(actual.child[index]!=null){
                    actual = actual.child[index];
                }else{
                    return null;
                }
            }
            if(actual==root) {
                return null;
            }
            return actual;
        }

        public boolean searchWord(String word){
            TrieNode actual= searchNode(word);
            if(actual==null){
                return false;
            }
            else {
                if(actual.isEndOfWord){
                    return true;
                }
            }
            return false;
        }


        public void insertWords(String [] products){
            for (String e: products){
                insertWord(e);
            }
        }
    }


    public static void main(String args[]){
        String products1[] = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord="mouse";
        TrieTree tree =new TrieTree();
        tree.insertWords(products1);
        boolean va= tree.searchWord(searchWord);
        System.out.println(va);




    }

}
