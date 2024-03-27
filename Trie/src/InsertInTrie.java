public class InsertInTrie {
    static Node root=new Node();

    public static void main(String[] args) {
        String[] words={"i","like","sam","samsung","mobile"};
        for (String word : words) {
            insert(word);
        }
        String key="ilikesamsung"; //all key exist in words array
        System.out.println(wordBreak(key));
    }

    private static boolean wordBreak(String key) {
        if(key.isEmpty())
            return true;
        for (int i = 1; i <= key.length(); i++) {
            String firstPart=key.substring(0,i);
            String secPart=key.substring(i);
            if(search(firstPart) && wordBreak(secPart))
                return true;
        }
        return false;
    }

    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i) - 'a';
            if(curr.children[idx]==null)
                curr.children[idx]=new Node();
            if(i==word.length()-1)
                curr.children[idx].eow=true;

            curr=curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null)
                return false;
            if(i==key.length()-1 && !curr.children[idx].eow)
                return false;
            curr=curr.children[idx];
        }
        return true;
    }
}
class Node{
    Node[] children;
    boolean eow;
    public Node(){
        children=new Node[26];
        for (int i = 0; i < 26; i++) {
            children[i]=null;
        }
        eow=false;
    }
}