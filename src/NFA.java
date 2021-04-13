import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class NFA extends TablaTransicion{

    private HashMap<Character, HashMap<Character, List<Integer>>> states = new HashMap<>();
    private Set<Character> alphabet = new HashSet<Character>();
    private Set<Integer> sts = new HashSet<>();

    public void McNaughtonYamadaThomson(ParseTree tree){
        while (tree.getChildCount() != 0){
            tree = tree.getChild(0);
            System.out.println(tree.toString());
        }
    }

    public Set<Integer> get(int state, char c){
        return sts;
    }
    public int getStates(){
        return 0;
    }
    public Set<Character> getAlphabet(){
        return alphabet;
    }
}